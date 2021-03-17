function actualizarReloj(){
var ahora = new Date();
var horas = ahora.getHours();
var minutos = ahora.getMinutes();
var segundos = ahora.getSeconds();

var resultado = horas + ":" + minutos + ":" + segundos;

document.ex_reloj.reloj.value = resultado;

setTimeout("actualizarReloj(",1000);
}