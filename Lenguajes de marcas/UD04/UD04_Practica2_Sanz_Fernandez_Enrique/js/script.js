
const form = document.getElementById('formCancion');
const tabla = document.querySelector('#tablaRanking tbody');
const mensaje = document.getElementById('mensaje');


form.addEventListener('submit', function(e) {
  e.preventDefault();
  
  const grupoVal = document.getElementById('grupo').value.trim();
  const cancionVal = document.getElementById('cancion').value.trim();
  const usuarioVal = document.getElementById('usuario').value.trim();

  
  if (!grupoVal) {
    alert('Falta el campo: Nombre del grupo');
    return;
  }
  if (!cancionVal) {
    alert('Falta el campo: Nombre de la canción');
    return;
  }
  if (!usuarioVal) {
    alert('Falta el campo: Nombre de usuario');
    return;
  }

  
  addRow(grupoVal, cancionVal, usuarioVal);

  
  mensaje.textContent = `${usuarioVal} gracias por añadir una canción.`;

  
  form.reset();
});


function calcularSiguientePuesto() {
  
  const filas = tabla.getElementsByTagName('tr');
  let maxPuesto = 0;
  for (let i = 0; i < filas.length; i++) {
    const puestoCell = filas[i].getElementsByTagName('td')[0];
    if (puestoCell) {
      const val = parseInt(puestoCell.textContent, 10);
      if (!isNaN(val) && val > maxPuesto) maxPuesto = val;
    }
  }
  return maxPuesto + 1;
}


function addRow(grupo, cancion, usuario) {
  const tr = document.createElement('tr'); 

  
  const tdPuesto = document.createElement('td');
  const tdGrupo = document.createElement('td');
  const tdCancion = document.createElement('td');
  const tdUsuario = document.createElement('td');
  const tdBorrar = document.createElement('td');

  
  tdPuesto.textContent = calcularSiguientePuesto();
  tdGrupo.textContent = grupo;
  tdCancion.textContent = cancion;
  tdUsuario.textContent = usuario;

  
  const img = document.createElement('img');
  img.src = './recursos/imagenes/icono.png';
  img.alt = 'Borrar';
  img.title = 'Borrar';
  img.className = 'trash';
  
  img.onclick = function() { deleteRow(this); }; 

  tdBorrar.appendChild(img);

  
  tr.appendChild(tdPuesto);
  tr.appendChild(tdGrupo);
  tr.appendChild(tdCancion);
  tr.appendChild(tdUsuario);
  tr.appendChild(tdBorrar);

  
  tabla.appendChild(tr);
}

function deleteRow(element) {
  
  const tr = element.closest('tr');
  if (tr) {
    tr.parentNode.removeChild(tr);
    
    mensaje.textContent = 'La canción se ha borrado correctamente.';
  }
}

document.addEventListener('DOMContentLoaded', function() {
  const existing = document.querySelectorAll('img.trash');
  existing.forEach(function(img) {
    if (!img.getAttribute('src')) img.src = './recursos/imagenes/icono.png';
    if (!img.getAttribute('title')) img.title = 'Borrar';
  });
});


