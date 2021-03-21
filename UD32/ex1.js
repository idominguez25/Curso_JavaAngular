//Variables
var MostrarTodo = document.getElementById('btn1');
var BuscarNombre = document.getElementById('btn2');
var BuscarNombreFullText = document.getElementById('btn3');
var BuscarCodigo = document.getElementById('btn4');
var BuscarCodigos = document.getElementById('btn5');
var BuscarMoneda = document.getElementById('btn6');
var BuscarLenguaje = document.getElementById('btn7');
var BuscarCapital = document.getElementById('btn8');
var BuscarCodigoLlamada = document.getElementById('btn9');
var BuscarRegion = document.getElementById('btn10');
var BuscarBloqueRegion = document.getElementById('btn11');


//EventListener
MostrarTodo.addEventListener('click', presionadoBtn1, false);
BuscarNombre.addEventListener('click', presionadoBtn2, false);
BuscarNombreFullText.addEventListener('click', presionadoBtn3, false);
BuscarCodigo.addEventListener('click', presionadoBtn4, false);
BuscarCodigos.addEventListener('click', presionadoBtn5, false);
BuscarMoneda.addEventListener('click', presionadoBtn6, false);
BuscarLenguaje.addEventListener('click', presionadoBtn7, false);
BuscarCapital.addEventListener('click', presionadoBtn8, false);
BuscarCodigoLlamada.addEventListener('click', presionadoBtn9, false);
BuscarRegion.addEventListener('click', presionadoBtn10, false);
BuscarBloqueRegion.addEventListener('click', presionadoBtn11, false);

function presionadoBtn1 (){
    alert('Mira la consola');

    $.ajax({
        url: "https://restcountries.eu/rest/v2/all",
        method: 'GET',
        dataType: 'json',
        
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
        error: function (error) {
            console.log(error);
        }
})
}

function presionadoBtn2(){
    var nombre = prompt("Introduce el nombre de un país:");

    $.ajax({
        url: "https://restcountries.eu/rest/v2/name/"+ nombre,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn3(){
    var nombre = prompt("Introduce el nombre de un país:");

    $.ajax({
        url: "https://restcountries.eu/rest/v2/name/"+ nombre+"?fullText=true",
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn4(){
    var codigo = prompt("Introduce un código del COI:");

    $.ajax({
        url: "https://restcountries.eu/rest/v2/alpha/"+ codigo,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn5(){
    var codigo1 = prompt("Introduce el primer código del COI:");
    var codigo2 = prompt("Introduce el segundo código del COI:");
    var codigo3 = prompt("Introduce el tercer código del COI:");

    $.ajax({
        url: "https://restcountries.eu/rest/v2/alpha?codes="+ codigo1 +";"
         + codigo2 + ";" + codigo3,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn6(){
    var moneda = prompt("Introduce el código de moneda:")

    $.ajax({
        url: "https://restcountries.eu/rest/v2/currency/"+ moneda,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn7(){
    var idioma = prompt("Introduce el código del idioma:")

    $.ajax({
        url: "https://restcountries.eu/rest/v2/lang/"+ idioma,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn8(){
    var capital = prompt("Introduce una capital:")

    $.ajax({
        url: "https://restcountries.eu/rest/v2/capital/"+ capital,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn9(){
    var codLlamada = prompt("Introduce el código de llamada:")

    $.ajax({
        url: "https://restcountries.eu/rest/v2/callingcode/"+ codLlamada,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn10(){
    var region = prompt("Introduce el nombre de una región:")

    $.ajax({
        url: "https://restcountries.eu/rest/v2/region/"+ region,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}

function presionadoBtn11(){
    var bloqueRegional = prompt("Introduce el nombre de un bloque regional:")

    $.ajax({
        url: "https://restcountries.eu/rest/v2/regionalbloc/"+ bloqueRegional,
        method: 'GET',
        dataType: 'json',
       
        success: function(data) {
            console.log(data.id);
            console.log(JSON.stringify(data));
        },
       error: function (error) {
           console.log(error);
       }

    })
}
