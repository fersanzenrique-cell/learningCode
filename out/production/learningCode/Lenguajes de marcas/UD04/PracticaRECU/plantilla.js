document.addEventListener(("DOMContentLoaded") , function() {
    // Cargo el DOM

    // 1. Capturo los elementos a modificar
    const boton = document.getElementById("btnAgregar");
    const mensaje = document.getElementById("mensaje");
    const tablaBody = document.getElementById("tablaBody");

    let contador = 0;

    // 2. Evento principal, al hacer CLICK

    boton.addEventListener("click", function() {
        // 3. LEO el formulario
        const campo1 = document.getElementById("articulo").value.trim();
        const campo2 = document.getElementById("cantidad").value.trim();
        const campo3 = document.getElementById("categoria").value.trim();

        // 4. Valido el formulario

        if (!campo1 || !campo2 || !campo3) {
            alert("faltan campos");
            return;
        }

        // 5. CREO fila, no tiene porque estar sujeto a nada en el momento de su creación 

        contador++;
        const fila = document.createElement("tr");
        //Si quiero añadir estilo, tendría que ser aquí y no en el css

        // Ahora creo lo que tiene que estar dentro de la variable fila
        // Por alguna razón esto se hace con la tecla ` en vez de " o ' 
        // Estamos ya poniendo el valor de campo dentro del tag, no se necesita hacer nada más
        fila.innerHTML = `
            <td>${contador}</td>
            <td>${campo1}</td>
            <td>${campo2}</td>
            <td>${campo3}</td>
            <td><button onclick="borrar(this)">BORRAR</button></td>
        `;
        // HACE REFERENCIA A THIS, AL ELEMENTO
        // Creamos botón y luego creamos la función de borrar, detrás del DOMContentLoaded
        // 6. INSERTO en tabla, en el último hijo

        tablaBody.appendChild(fila);

        // tablaBody es el elemento padre, creamos todo otro row a través de ese padre

        // 7. Mensaje que queremos dar
        mensaje.textContent = "Elemento añadido";
        mensaje.style.color = "green";
    });
});

// 8. Ahora detrás del DOMContentLoaded, creamos la función BORRAR

function borrar(button) { // Coge como argumento un botón? y hace remove del padre?
    button.parentNode.parentNode.remove();
    // CLARO!! hace remove de la const fila (28) su tr
}