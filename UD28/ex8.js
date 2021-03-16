var numero = prompt("Introduce un número:");

if(numero < 0){
    alert("El número tiene que ser entero!");
}
else {
    var resultado = ParImpar(numero);
    alert("El número és " + resultado);
}

function ParImpar (numero) {
    if (numero % 2 == 0) {
        return "par";
    }
    else {
        return "impar";
    }
}