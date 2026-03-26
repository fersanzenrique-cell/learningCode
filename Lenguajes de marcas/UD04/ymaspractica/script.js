document.addEventListener("DOMContentLoaded", function() {
    const boton = document.getElementById("btnAgregar");
    const tabla = document.getElementById("tabla");
    let mensaje = document.getElementById("mensaje");
    let contador = 0;
    boton.addEventListener("click", function(e) {
        e.preventDefault();
        const nombre = document.getElementById("nombre").value;
        const telefono = document.getElementById("telefono").value;
        if (!nombre || !telefono) {
            alert("No has introducido todos los datos.");
            return;
        }
        contador++;
        mensaje.innerText = `Has agregado ${nombre} con el número de teléfono ${telefono}`;
        mensaje.style.fontSize = "20px";
        mensaje.style.color = "green";
        const columnBorrar = document.createElement("td");
        const botonBorrar = document.createElement("button");
        botonBorrar.innerText = "BORRAR";
        botonBorrar.id = "btnBorrar";
        const fila = document.createElement("tr");
        fila.innerHTML =`<td>${contador}</td><td>${nombre}</td><td>${telefono}</td>`;
        columnBorrar.appendChild(botonBorrar);
        fila.appendChild(columnBorrar);
        tabla.appendChild(fila);
        botonBorrar.addEventListener("click", function() {
            mensaje.innerText = `Has borrado a ${nombre}`;
            mensaje.style.color = "red";
            fila.remove();
        });
    })
})
