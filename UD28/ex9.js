var cadena = prompt("Introduce una frase:");
comprobarMayusculasMinusculas(cadena);

function comprobarMayusculasMinusculas(cadena) {

    // Comprobar mayúsculas y minúsculas
    if(cadena == cadena.toUpperCase()) {
        alert("La frase está formada sólo por mayúsculas.");
    
    }
    else if(cadena == cadena.toLowerCase()) {
      alert("La frase está formada sólo por minúsculas.");
    }
    else {
     alert("La frase está formada por mayúsculas y minúsculas.");
    }
}