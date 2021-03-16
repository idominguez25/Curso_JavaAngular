var numero = prompt("Introduce un número");
var resultado = 1;

for(var i=1; i<=numero; i++) {
  resultado *= i;
}
alert("El factorial de " + numero + " és ="+ resultado);