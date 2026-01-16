
document.addEventListener('DOMContentLoaded', function () {
  var boton = document.getElementById('botonLoco');
  var form = document.getElementById('frikiForm');
  var status = document.getElementById('status');

  boton.addEventListener('click', function () {
    if (document.body.classList.contains('loco')) {
      document.body.classList.remove('loco');
      status.textContent = 'Modo loco OFF';
    } else {
      document.body.classList.add('loco');
      status.textContent = 'Modo loco ON';
    }
  });

  form.addEventListener('submit', function (e) {
    
    var comentarios = document.getElementById('comentarios');
    if (!comentarios) return;

    if (comentarios.value.trim().length < 5) {
      e.preventDefault();
      status.textContent = 'Escribe al menos 5 caracteres en comentarios';
      comentarios.focus();
      comentarios.classList.add('invalid');
      return;
    }

    e.preventDefault();
    status.textContent = 'Enviado (simulado) — ¡gracias!';
    form.reset();
  });

  form.addEventListener('input', function (e) {
    if (e.target.classList && e.target.classList.contains('invalid')) {
      e.target.classList.remove('invalid');
      status.textContent = '';
    }
  });
});