var tasks = [{
  'name': 'Write for Envato Tuts+',
  'duration':120 
},
{
    'name': 'Work out',
    'duration':60
},
{
    'name': 'Procrastinate on Duolingo',
    'duration':240
}
];

let arrayTareas = [];

function obtenerNombresT(){
    let respuestaN=" ";
    tasks.forEach(j=>{
        arrayTareas.push(j.name);
        respuestaN = respuestaN + " "+ j.name;
    });
    document.getElementById("gestor").innerHTML = respuestaN;
}


//console.log(arrayTareas); 

let tareasDemoradas = [];

function obtenerTareasLargas(){
    let respuestaT = "Las Tareas Mas Largas Son: ";
    tasks.forEach(j=>{
        if(j.duration >= 120){
            tareasDemoradas.push(j);
            respuestaT = respuestaT + " "+" Nombre: " + j.name + " "+" Duración: " + j.duration + " minutos";
        }
    });
    document.getElementById("gestor").innerHTML = respuestaT;
}

//console.log(tareasDemoradas);

function obtenerTiempoT(){
    let cantidadTiempoT = 0;

    tasks.forEach(j=>{
        cantidadTiempoT = cantidadTiempoT + j.duration;
    });

    document.getElementById("gestor").innerHTML = "El tiempo para completar las Tareas es: " + cantidadTiempoT + " minutos";
}

//console.log("La cantidad de tiempo para hacer todas las tareas es: " + cantidadTiempoT);

var numbers = [1,2,3,4,5];

function obtenerSumaArrayN(){
    let sumaNumbers = 0;

    numbers.forEach(i=>{
        sumaNumbers = sumaNumbers + i;
    });

    document.getElementById("gestor").innerHTML = "La Suma de los elementos del array numbers es: " + sumaNumbers;
}

//console.log("La suma de los elementos del Array numbers es: " + sumaNumbers);
