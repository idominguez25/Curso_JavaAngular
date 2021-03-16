palindromo("Isaac no ronca asi");
palindromo("Esto no es un palíndromo");

function palindromo(cadena) {
  
    // Pasar a minusculas la cadena.
    var cadenaOriginal = cadena.toLowerCase();
  
    // Convertir la cadena en un array.
    var letrasEspacios = cadenaOriginal.split("");
  
    // Eliminar los espacios en blanco.
    var cadenaSinEspacios = "";
    for(i in letrasEspacios) {
      if(letrasEspacios[i] != " ") {
        cadenaSinEspacios += letrasEspacios[i];
      }
    }
  
    var letras = cadenaSinEspacios.split("");
    var letrasReves = cadenaSinEspacios.split("").reverse();
  
    for(i in letras) {
      if(letras[i] == letrasReves[i]) {
        alert( cadena + ": Es un palíndromo.");
      }
      else {
         alert(cadena + ": No es un palíndromo.");
      }
    }
  }
