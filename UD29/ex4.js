window.onload = function(){ //Acciones tras cargar la página
pantalla=document.getElementById("textoPantalla"); //Carga el textoPantalla por defecto.
document.onkeydown = teclado; //Activamos el teclado.
}
x="0"; //Número por defecto.
xi=1; //Iniciamos el número de la pantalla, 1 = si, 0 = no.
coma=0; //Para saber si hay una coma, 0=no, 1=si.
ni=0; //Número oculto o en espera.
op="no"; //Operaciones en curso, no = sin operaciones.

//Mostrar números en pantalla mientras se van escribiendo.
function numero(xx) { //Cogemos el número pulsado.
         if (x || xi==1) { //Si hay un número por defecto o xi=1, és decir,
         					//que iniciamos el número de la pantalla...
            pantalla.innerHTML=xx; //Mostramos el número en la pantalla.
            x=xx; //Guardamos el número en la variable de número por defecto.
            if (xx==".") { //Si escribimos una coma al principio del número...
               pantalla.innerHTML="0."; //...escribimos 0.
               x=xx; //Guardamos el número.
               coma=1; //Cambiamos el estado de la coma.
               }
           }
           else { //Si no, continuamos escribiendo números.
               if (xx=="." && coma==0) { //si escribimos una coma por primera vez...
                   pantalla.innerHTML+=xx;
                   x+=xx;
                   coma=1; //Cambiamos el estado de la coma.
               }
               //si intentamos escribir una segunda coma decimal no realiza ninguna acción.
               else if (xx=="." && coma==1) {} 
               //Resto de casos: escribir un número del 0 al 9: 	 
               else {
                   pantalla.innerHTML+=xx;
                   x+=xx
               }
            }
            xi=0 //Cambiamos el estado de la variable xi.
         }

//Función para hacer las operaciones.
function operar(s) {
         igualar() //si hay operaciones pendientes se realizan éstas primero.
         ni=x //ponemos el primer número en espera para poder escribir el segundo.
         op=s; //guardamos tipo de operación.
         xi=1; //Cambiamos el estado de la variable xi.
}

//Función para cuando se pulse el botón =.
function igual() {
         if (op=="no") { //Si no hay ninguna operación pendiente...
            pantalla.innerHTML=x; //mostramos el mismo número	
            }
         else { //Si no, resolvemos la operación pendiente.
            sl=ni+op+x; // Escribimos la operación en una cadena.
            sol=eval(sl) //convertimos la cadena a código y lo resolvemos.
            pantalla.innerHTML=sol //mostramos la solución.
            x=sol; //guardamos la solución.
            op="no"; //Como no hay operaciones pendientes,
            xi=1; //se puede reiniciar la pantalla.
            }
        }
function raizc() {
         x=Math.sqrt(x) //resolver ra&iacute;z cuadrada.
         pantalla.innerHTML=x; //mostrar en pantalla resultado
         op="no"; //quitar operaciones pendientes.
         xi=1; //se puede reiniciar la pantalla 
         }
function porcent() { 
         x=x/100 //dividir por 100 el n&uacute;mero
         pantalla.innerHTML=x; //mostrar en pantalla
         igualar() //resolver y mostrar operaciones pendientes
         xi=1 //reiniciar la pantalla
         }
function opuest() { 
         nx=Number(x); //convertir en n&uacute;mero
         nx=-nx; //cambiar de signo
         x=String(nx); //volver a convertir a cadena
         pantalla.innerHTML=x; //mostrar en pantalla.
         }
function inve() {
         nx=Number(x);
         nx=(1/nx);
         x=String(nx);		 
         pantalla.innerHTML=x;
         xi=1; //reiniciar pantalla al pulsar otro n&uacute;mero.
         }

function retro(){ //Borrar s&oacute;lo el &uacute;ltimo n&uacute;mero escrito.
         cifras=x.length; //hayar n&uacute;mero de caracteres en pantalla
         br=x.substr(cifras-1,cifras) //describir &uacute;ltimo caracter
         x=x.substr(0,cifras-1) //quitar el ultimo caracter
         if (x=="") {x="0";} //si ya no quedan caracteres, pondremos el 0
         if (br==".") {coma=0;} //Si el caracter quitado es la coma, se permite escribirla de nuevo.
         pantalla.innerHTML=x; //mostrar resultado en pantalla	 
         }
function borradoParcial() {
        pantalla.innerHTML=0; //Borrado de pantalla;
        x=0;//Borrado indicador n&uacute;mero pantalla.
        coma=0;	//reiniciamos tambi&eacute;n la coma				
        }
function borrarTodo() {
         pantalla.innerHTML=0; //poner pantalla a 0
         x="0"; //reiniciar n&uacute;mero en pantalla
         coma=0; //reiniciar estado coma decimal 
         ni=0 //indicador de n&uacute;mero oculto a 0;
         op="no" //borrar operaci&oacute;n en curso.
         }
function teclado (elEvento) { 
         evento = elEvento || window.event;
         k=evento.keyCode; //n&uacute;mero de c&oacute;digo de la tecla.
         //teclas n&uacute;mericas del teclado alfamun&eacute;rico
         if (k>47 && k<58) { 
            p=k-48; //buscar n&uacute;mero a mostrar.
            p=String(p) //convertir a cadena para poder a&ntilde;&aacute;dir en pantalla.
            numero(p); //enviar para mostrar en pantalla
            }	
         //Teclas del teclado n&uacute;merico. Seguimos el mismo procedimiento que en el anterior.
         if (k>95 && k<106) {
            p=k-96;
            p=String(p);
            numero(p);
            }
         if (k==110 || k==190) {numero(".")} //teclas de coma decimal
         if (k==106) {operar('*')} //tecla multiplicaci&oacute;n
         if (k==107) {operar('+')} //tecla suma
         if (k==109) {operar('-')} //tecla resta
         if (k==111) {operar('/')} //tecla divisi&oacute;n
         if (k==32 || k==13) {igualar()} //Tecla igual: intro o barra espaciadora
         if (k==46) {borradoTotal()} //Tecla borrado total: "supr"
         if (k==8) {retro()} //Retroceso en escritura : tecla retroceso.
         if (k==36) {borradoParcial()} //Tecla borrado parcial: tecla de inicio.
         }