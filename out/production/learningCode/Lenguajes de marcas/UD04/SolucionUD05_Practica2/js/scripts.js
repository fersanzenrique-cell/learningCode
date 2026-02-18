// Esperar a que cargue el DOM
window.onload = function() {
  const btnAgregar = document.getElementById("btnAgregar");
  const tabla = document.getElementById("tablaTop").getElementsByTagName("tbody")[0];
  const mensaje = document.getElementById("mensaje");

  btnAgregar.addEventListener("click", function() {
    // Capturar valores del formulario
    const grupo = document.getElementById("grupo").value.trim();
    const cancion = document.getElementById("cancion").value.trim();
    const usuario = document.getElementById("usuario").value.trim();

    // Validar campos
    if (!grupo || !cancion || !usuario) {
      let faltan = [];
      if (!grupo) faltan.push("Nombre del grupo");
      if (!cancion) faltan.push("Nombre de la canción");
      if (!usuario) faltan.push("Nombre de usuario");
      alert("Faltan los siguientes campos por rellenar: " + faltan.join(", "));
      return;
    }

    // Crear nueva fila
    const fila = document.createElement("tr");

    // Calcular el puesto
    const puesto = tabla.rows.length + 1;

    // Crear celdas
    const celdaPuesto = document.createElement("td");
    celdaPuesto.textContent = puesto;

    const celdaGrupo = document.createElement("td");
    celdaGrupo.textContent = grupo;

    const celdaCancion = document.createElement("td");
    celdaCancion.textContent = cancion;

    const celdaUsuario = document.createElement("td");
    celdaUsuario.textContent = usuario;

    const celdaBorrar = document.createElement("td");
    const icono = document.createElement("img");
    icono.src = "https://cdn-icons-png.flaticon.com/512/1214/1214428.png";
    icono.alt = "Borrar";
    icono.width = 24;
    icono.style.cursor = "pointer";

    // Asignar evento borrar
    icono.onclick = function() {
      borrarFila(this);
    };

    celdaBorrar.appendChild(icono);

    // Añadir celdas a la fila
    fila.appendChild(celdaPuesto);
    fila.appendChild(celdaGrupo);
    fila.appendChild(celdaCancion);
    fila.appendChild(celdaUsuario);
    fila.appendChild(celdaBorrar);

    // Conectar la fila al DOM
    tabla.appendChild(fila);

    // Mostrar mensaje
    mensaje.textContent = `${usuario}, gracias por añadir una canción.`;

    // Limpiar formulario
    document.getElementById("formCancion").reset();
  });

  // Función borrar fila
  window.borrarFila = function(icono) {
    const fila = icono.parentNode.parentNode;
    fila.remove();

    // Actualizar puestos
    const filas = tabla.getElementsByTagName("tr");
    for (let i = 0; i < filas.length; i++) {
      filas[i].getElementsByTagName("td")[0].textContent = i + 1;
    }

    // Mostrar mensaje
    mensaje.textContent = "La canción se ha borrado correctamente.";
  };
};