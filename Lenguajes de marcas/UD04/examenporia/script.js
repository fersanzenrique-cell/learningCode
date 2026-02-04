document.getElementById("btnAgregar").onclick = agregar;

function agregar() {
    const articulo = document.getElementById("articulo").value;
    const cantidad = document.getElementById("cantidad").value;
    const categoria = document.getElementById("categoria").value;

    let faltan = [];

    if (articulo === "") faltan.push("Artículo");
    if (cantidad === "") faltan.push("Cantidad");
    if (categoria === "") faltan.push("Categoría");

    if (faltan.length > 0) {
        alert("Faltan campos por rellenar: " + faltan.join(", "));
        return;
    }

    const tabla = document.getElementById("tablaBody");
    const fila = tabla.insertRow();

    fila.insertCell(0);
    fila.insertCell(1).textContent = articulo;
    fila.insertCell(2).textContent = cantidad;
    fila.insertCell(3).textContent = categoria;

    fila.insertCell(4).innerHTML =
        '<button class="btn-borrar" onclick="borrar(this)">BORRAR</button>';

    recalcular();

    const mensaje = document.getElementById("mensaje");
    mensaje.textContent = `Has añadido '${articulo}' (${cantidad}) en ${categoria}.`;
    mensaje.style.color = "#006400";
}

function borrar(boton) {
    const fila = boton.parentNode.parentNode;
    const articulo = fila.cells[1].textContent;

    fila.remove();
    recalcular();

    const mensaje = document.getElementById("mensaje");
    mensaje.textContent = `El artículo '${articulo}' se ha borrado correctamente.`;
    mensaje.style.color = "red";
}

function recalcular() {
    const filas = document.querySelectorAll("#tablaBody tr");
    for (let i = 0; i < filas.length; i++) {
        filas[i].cells[0].textContent = i + 1;
    }
}
