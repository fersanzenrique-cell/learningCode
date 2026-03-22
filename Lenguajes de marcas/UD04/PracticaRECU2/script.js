document.addEventListener("DOMContentLoaded",function(){
    const botonAgregar = document.getElementById("btnSubmit");
    const mensaje = document.getElementById("MensajeDinamico");
    const tabla = document.getElementById("tabla");
    let contador = 0;

    botonAgregar.addEventListener("click", function(e){
        e.preventDefault();
        
        const articulo = document.getElementById("Articulo").value.trim();
        const cantidad = document.getElementById("Cantidad").value.trim();
        const categoria = document.getElementById("Categoria").value.trim();
        if (!articulo || !cantidad || !categoria) {
            alert("Faltan Campos");
            return;
        }
        contador++;
        const fila = document.createElement("tr");
        if (contador % 2 != 0) fila.style.backgroundColor = "rgb(240, 240, 240)";
        else fila.style.backgroundColor = "white";
        fila.style.color = "black";
        fila.innerHTML= `
        <td>${contador}</td>
        <td>${articulo}</td>
        <td>${cantidad}</td>
        <td>${categoria}</td>
        `;
        const rowBorrar = document.createElement("td");
        const botonBorrar = document.createElement("button");
        botonBorrar.textContent = "BORRAR";
        botonBorrar.addEventListener("click", function() {
            fila.remove();
            mensaje.textContent = `Has borrado "${articulo}" (${cantidad}) en ${categoria}.`;
            mensaje.style.color = "red";
        });
        botonBorrar.style.background = "none";
        botonBorrar.style.borderStyle = "hidden";
        rowBorrar.appendChild(botonBorrar);
        fila.appendChild(rowBorrar);
        tabla.appendChild(fila);
        mensaje.textContent = `Has añadido "${articulo}" (${cantidad}) en ${categoria}.`;
        mensaje.style.color = "green";
    })
});

