document.addEventListener('DOMContentLoaded', function () {

    const botonEnvio = document.getElementById('btnAgregar');
    const botonReset = document.getElementById('btnReset');
    const mensajeDinamico = document.getElementById('mensajeDinamico');
    const tablaBody = document.getElementById('tablaBody');

    let contador = 0;

    botonEnvio.addEventListener('click', function () {

        const articulo = document.getElementById('articulo').value;
        const cantidad = document.getElementById('cantidad').value;
        const categoria = document.getElementById('categoria').value;

        let faltan = [];

        if (!articulo) faltan.push("Articulo");
        if (!cantidad) faltan.push("Cantidad");
        if (!categoria) faltan.push("Categoria");
        if (cantidad && isNaN(cantidad)) {
            alert("La cantidad debe ser numérica");
            return;
        }

        if (faltan.length > 0) {
            alert("Faltan campos por rellenar: " + faltan.join(", "));
            return;
        }

        contador++;

        const fila = document.createElement('tr');

        fila.innerHTML = `
            <td>${contador}</td>
            <td>${articulo}</td>
            <td>${cantidad}</td>
            <td>${categoria}</td>
            <td>
                <button onclick="borrarFila(this)">Borrar</button>
            </td>
        `;

        tablaBody.appendChild(fila);

        mensajeDinamico.style.color = "green";
        mensajeDinamico.textContent =
            `Has añadido '${articulo}' (${cantidad}) en ${categoria}.`;
    });

    botonReset.addEventListener('click', function () {
        mensajeDinamico.style.color = "red";
        mensajeDinamico.textContent = "Formulario reseteado.";
    });

});

function borrarFila(boton) {
    const fila = boton.parentNode.parentNode;
    const articulo = fila.children[1].textContent;

    fila.remove();

    document.getElementById("mensajeDinamico").style.color = "red";
    document.getElementById("mensajeDinamico").textContent =
        `El articulo '${articulo}' se ha borrado correctamente.`;

    recalcular();
}

function recalcular() {
    const filas = document.querySelectorAll("#tablaBody tr");
    filas.forEach((fila, index) => {
        fila.children[0].textContent = index + 1;
    });
}
