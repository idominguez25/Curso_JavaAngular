var fechaIntroducida = prompt("Introduce una fecha:");
validarFormatoFecha(fechaIntroducida);

var emailIntroducido = prompt("Introduce tu correo electrónico:");
validarEmail(emailIntroducido);

var nombreIntroducido = prompt("Introduce un nombre y apellido:");
ordenInverso(nombreIntroducido);

//Función para validar la fecha.
function validarFormatoFecha(fechaIntroducida) {
    var RegExPattern = /^\d{1,2}\/\d{2}\/\d{4}$/;
    if ((fechaIntroducida.match(RegExPattern)) && (fechaIntroducida!='')) {
          alert("Fecha correcta.");
    } else {
          alert("Fecha incorrecta.");
    }
}
//Función para validar el correo electrónico.
function validarEmail(emailIntroducido) {
    if (/^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i.test(emailIntroducido)){
     alert("El correo electrónico es correcto.");
    } else {
     alert("El correo electrónico es incorrecto.");
    }
}
function escapeHTML (){
      var replacements = [["&", "&amp;"], ["\"", "&quot;"],
                        ["<", "&lt;"], [">", "&gt;"]];
      forEach(replacements, function(replace) {
            text = text.replace(replace[0], replace[1])
      });
}
function ordenInverso (nombreIntroducido){
      var nombreReves = nombreIntroducido.split(" ").reverse();
      alert(nombreReves);
}