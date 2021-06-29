let arrayBase = [11,7,12,14,19,1,6,18,8,20];

//Ordenamiento por Insercion
let j,temporal;
for(let i=1;i<arrayBase.length;i++){
    j=i;
    temporal = arrayBase[i];
    while((j>0)&&(arrayBase[j-1]>temporal)){
        arrayBase[j] = arrayBase[j-1];
        j--;
    }
    arrayBase[j] = temporal;
}
//Diviendo el array en dos sub arrays
let tam = arrayBase.length;

let arrayParte1 = arrayBase.slice(0,(tam/2));
let arrayParte2 = arrayBase.slice((tam/2),arrayBase.length);

//Función a Desarrollar -Punto 4
function mostrarMensajeN(){
    let numeroIngresado = document.getElementById("numeroU").value;
    let respuesta = " ";

    for(let i=0;i<(tam/2);i++){
        if(numeroIngresado == arrayParte1[i] || numeroIngresado == arrayParte2[i]){
            respuesta = "Se encontro el valor Ingresado" + " " + "El arreglo es: " + arrayBase;
        }else{
            respuesta = "No se encontro el valor Ingresado" + " " + "El arreglo es: " + arrayBase;
        }
    }
    document.getElementById("mostrarN").innerHTML = respuesta; 
}
console.log(arrayParte2);

const superheroes = [
    {
        name: 'Bruce Wayne',
        alias: 'Batman',
        powerLevel:50,
        universe:'DC Comics',
        race:'Human',
    },
    {
        name: 'Wade Wilson',
        alias: 'Deadpool',
        powerLevel: 70,
        universe: 'Marvel Comics',
        race: 'Mutant'
    },
]

function mostrarArregloSuperH(){
    let respuesta = "";
    for(let i=0;i<superheroes.length;i++){
        respuesta = respuesta + " Nombre Super Heroe: " + superheroes[i].name + " Alias Super Heroe: " + superheroes[i].alias
        + "Nivel de Poder: " + superheroes[i].powerLevel + " Universo: " + superheroes[i].universe + " Raza: " + superheroes[i].race; 
    }
    document.getElementById("arregloSP").innerHTML = respuesta;
}

function agregarHeroe(){
    let nombreSuperH = document.getElementById("nombreSP").value;
    let aliasSuperH = document.getElementById("aliasSP").value;
    let nivelPoderS = document.getElementById("nivelPoderSP").value;
    let universoSuperH = document.getElementById("universoSP").value;
    let razaSuperH = document.getElementById("razaSP").value;

    superheroes.push({name:nombreSuperH,alias:aliasSuperH,powerLevel:nivelPoderS,universe:universoSuperH,race:razaSuperH})
}

console.log(superheroes);

