let arrayUno = [];

function getRandomArbitrary(min,max){
    return Math.random()*(max-min) +min;
}

function llenarArrayAleatorio(){
    let topeLlenado = document.getElementById("tamA").value;
    let i=0;

    if(topeLlenado < 0){
        alert("Tamaño Invalido");
    }else{
        while (arrayUno.length < topeLlenado){
            let numAleatorio = Math.ceil(getRandomArbitrary(40,60));
            arrayUno.push(numAleatorio);
        }
    }
    alert("Proceso Exitoso");
}

function mostrarArrayUno(){
    let respuesta = "";

    for(let i=0;i<arrayUno.length;i++){
        respuesta = respuesta + " " + arrayUno[i];
    }

    document.getElementById("arrayS").innerHTML = respuesta;
}

let allThingsArray = [29,'fruits',-8,'ADSI',67,54,1835271];

document.getElementById("allThingsBase").innerHTML = allThingsArray;

function agregarValores(){
    allThingsArray.push('Perfect!');
    allThingsArray.push(203);
    allThingsArray.push('?!*abc');
    document.getElementById("allThingsNew").innerHTML = allThingsArray;
}

function eliminarInicioArray(){
    allThingsArray.shift();
    document.getElementById("allThingsNew").innerHTML = allThingsArray;
}

let arrayCinvertido = [];
function agregarDato(){
    let valorUsuario = document.getElementById("valorU").value;
    arrayCinvertido.push(valorUsuario);
    alert("Proceso de Agregacion Exitosos");
}

function mostrarArrayInicial(){
    document.getElementById("arrayEspecial").innerHTML = arrayCinvertido;
}

function mostrarArrayInverso(){
    let arrayInverso = arrayCinvertido.reverse();
    document.getElementById("arrayEspecial").innerHTML = arrayInverso;
}



function dividirCadena(){
    let cadenaADividir = document.getElementById("cadenaU").value;
    let separador = document.getElementById("separadorU").value;
    var arrayCadenas = cadenaADividir.split(separador);
    let respuestaCadena = '<p>La cadena original es: "' + cadenaADividir + '"' + "\n" + '<br>El separador es: "' + 
    separador + "\n" + '"' + "El array tiene " +  arrayCadenas.length + " elementos";

    for(let i=0; i<arrayCadenas.length;i++){
        respuestaCadena = respuestaCadena + " " + arrayCadenas[i];
    }
    document.getElementById("cadenaEspecial").innerHTML = respuestaCadena;
}
//console.log(arrayCinvertido);
//console.log(arrayUno);