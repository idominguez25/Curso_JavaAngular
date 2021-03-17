var tiradas = 0;
var resultados = []; 
while (tiradas < 36){
    //Tiramos los dados.
    var dado1 = Math.floor(Math.random() * 6) + 1;
    var dado2 = Math.floor(Math.random() * 6) + 1;
    console.log(dado1);
    console.log(dado2);
    //Sumamos el contenido de los dos dados.
    var suma = dado1 + dado2;
    console.log(suma);
    for (var i = 1; i < 36; i++){
        resultados[i] = suma;
        console.log(resultados[i]);
    }
    tiradas++;
}