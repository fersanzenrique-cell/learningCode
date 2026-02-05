document.addEventListener("DOMContentLoaded",function () {

    const btnAgregar = document.getElementById("btnAgregar");
    const tablaBody = document.getElementById("tablaBody");
    const mensaje = document.getElementById("mensaje");
    
    let contador = 0;

    btnAgregar.addEventListener("click",function() {

        const tarea = document.getElementById("tarea").value.trim();
        const prioridad = document.getElementById("prioridad").value.trim();

        if (isNaN(prioridad)) {
            alert('Prioridad tiene que ser un número.');
            return;
        } else if (!tarea && !prioridad){
            alert('Faltan los dos campos por rellenar.');
            return;
        } else if (!tarea) {
            alert('Falta Tarea por rellenar.');
            return;
        } else if (!prioridad) {
            alert('Falta prioridad por rellenar.');
            return;
        }
        alert();
        contador++;

        let row = document.createElement("tr");


        row.innerHTML = `
            <td>${contador}</td>
            <td>${tarea}</td>
            <td>${prioridad}</td>
            <td>
                <button onclick="borrar(this)">Eliminar</button>
            </td>
        `;
        
        tablaBody.appendChild(row);
        alert();
        mensaje.textContent = "La tarea " + tarea + " ha sido añadida.";
        alert();
        mensaje.style.color = "green";
        alert();

        function borrar(boton) {
            boton.parentNode.parentNode.remove();
            mensaje.textContent = "La tarea " + tarea + " ha sido borrada.";
            mensaje.style.color = "red";
        }
    });
});




