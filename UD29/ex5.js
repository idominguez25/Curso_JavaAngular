window.onload = function() {
    var visor1 = document.getElementById("visor"); //referencia al visor
    var titulo = document.getElementById("titulo"); //referencia al pie de foto
}
function foto(num) { //cambiar la imagen
    f="foto"+num+".jpg"; //ruta de la nueva imagen
    document.images["fotoVisor"].src=f; //cambiar imagen
    t=document.images["fotos"+num].alt; //texto de pie de foto
    titulo.innerHTML=t; //cambiar pie de foto
}