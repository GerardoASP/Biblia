class NodeClass{
    constructor(value){
        this.value = value;
        this.next = null;
    }
}

class listasSimples{
    constructor(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    anadirFinal(valor){
        let newNode = new NodeClass(valor);

        if(!this.head){
            this.head = newNode;
            this.tail = this.head;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }

    anadirInicio(valor){
        let newNode = new NodeClass(valor);

        if(!this.head){
            this.head = newNode;
            this.tail = this.head;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
        return this;
    }

    eliminarFinal(){
        if(!this.head) return undefined;

        let nodoVisitado = this.head;
        let nuevoColaLista = nodoVisitado;
        while(nodoVisitado.next){
            nuevoColaLista = nodoVisitado;
            nodoVisitado = nodoVisitado.next;
        }
        this.tail = nuevoColaLista;
        this.tail.next = null;
        this.length--;
        if(this.length === 0){
            this.head = null;
            this.tail = null;
        }
        return nodoVisitado;
    }

    eliminarInicio(){
        if(!this.head) return undefined;

        let cabezaActual = this.head;
        this.head = cabezaActual.next;
        this.length--;
        if(this.length === 0){
            this.head = null;
            this.tail = null;
        }
        return cabezaActual;
    }

    getPosicionPuntero(index) {
        if (index < 0 || index >= this.length) return null;
        let contadorPuntero = 0;
        let nodoVisitado = this.head;
        while (contadorPuntero !== index) {
            nodoVisitado = nodoVisitado.next;
            contadorPuntero++;
        }
        return nodoVisitado;
    }

    removerNodoPorPosicion(index) {
        let nodoVisitado = this.head;
        let nodoAnteriorAlVisitado = null;
        if (index < 0 || index >= this.length) return null;
        if (index === 0){
            this.head = nodoVisitado.next;
        }else {
            for (let i = 0; i < index; i++) {
                nodoAnteriorAlVisitado = nodoVisitado;
                nodoVisitado = nodoVisitado.next;
            }
            nodoAnteriorAlVisitado.next = nodoVisitado.next;
        }
        this.length--;
        return nodoVisitado.valor;
    }

    removerNodoPorValor(valor) {
        let nodoVisitado = this.head;
        let nodoAnteriorAlVisitado = null;
        while (nodoVisitado !== null) {
            if (nodoVisitado.valor === valor) {
                if (!nodoAnteriorAlVisitado){
                    this.head = nodoVisitado.next;
                }else{
                    nodoAnteriorAlVisitado.next = nodoVisitado.next;
                }
                this.length--;
                return nodoVisitado.valor;
            }
            nodoAnteriorAlVisitado = nodoVisitado;
            nodoVisitado = nodoVisitado.next;
        }
        return null;
    }

    anadirCabeza(){
        let newNode = new NodeClass(this.getPosicionPuntero(0).value);

        if(!this.head){
            this.head = newNode;
            this.tail = this.head;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }

    eliminarNodosPares(){
        if(!this.head){
            return undefined;
        }else if(this.head){
            let nodoVs = this.head;
            while(nodoVs){
                if(nodoVs.value % 2 == 0){
                    this.removerNodoPorValor(nodoVs.value);
                }
                nodoVs = nodoVs.next;
            }
        }
    }

    insertarNodoPorPosicion(valor, index) {
        let newNode = new NodeClass(valor);
        let nodoVisitado = this.head;
        let nodoAnteriorAlVisitado;
        if (index < 0 || index >= this.length) return null;
        if (index === 0) this.añadirNodoI(valor);
        else {
            for (let i = 0; i < index; i++) {
                nodoAnteriorAlVisitado = nodoVisitado;
                nodoVisitado = nodoVisitado.next;
            }
            newNode.next = nodoVisitado;
            nodoAnteriorAlVisitado.next = newNode;
        }
        this.length++;
    }
}

let instaClass = new listasSimples();

instaClass.anadirFinal(2);
instaClass.anadirFinal(3);
instaClass.anadirFinal(4);
instaClass.anadirFinal(2);
instaClass.anadirFinal(2);
instaClass.anadirFinal(6);
instaClass.anadirFinal(3);
instaClass.anadirFinal(1);

function contarRepeticiones(){
    let valorNodoU = document.getElementById("valorU").value;
    let nodoVisitado = instaClass.head;
    let contadorEspecial = 0;
    while(nodoVisitado){
        if(nodoVisitado.value == valorNodoU){
            contadorEspecial++;
        }
        nodoVisitado = nodoVisitado.next;
    }
    document.getElementById("mostrarRespuesta").innerHTML = "La cantidad de veces que aparece " + valorNodoU + " es " + contadorEspecial;
}

function insertarNodoEnPosVC(){
    let posImportante = document.getElementById("valorIndice").value;
    let nodoVisitado = instaClass.head;
    let contadorImportante = 0;
    let aux = null;

    if(posImportante == 0 || posImportante > instaClass.length || posImportante < 0){
        alert("Posicion Invalida");
    }else{
        while(nodoVisitado){
            if(contadorImportante == posImportante){
                instaClass.insertarNodoPorPosicion(aux.value*aux.value,posImportante);
                alert("Proceso Exitoso");
            }
            contadorImportante++;
            aux = nodoVisitado;
            nodoVisitado = nodoVisitado.next;
        }
    }
}

function mostrarListaSimple(){
    let respuestaLS = "La lista Simple es: ";
    let nodoVisitado = instaClass.head;
    while(nodoVisitado){
        respuestaLS = respuestaLS + nodoVisitado.value + "-" ;
        nodoVisitado = nodoVisitado.next;
    }
    document.getElementById("mostrarListaS").innerHTML = respuestaLS;
}

function mostrarListaSimple2(){
    let respuestaLS = "La lista Simple es: ";
    let nodoVisitado = instaClass.head;
    while(nodoVisitado){
        respuestaLS = respuestaLS + nodoVisitado.value + "-" ;
        nodoVisitado = nodoVisitado.next;
    }
    document.getElementById("mostrarListaSimple").innerHTML = respuestaLS;
}

function eliminarNodosIguales(){
    let valorAeliminar = document.getElementById("valorEl").value;
    let nodoVisitado = instaClass.head;
    let posNodo = 0;
    while(nodoVisitado){
        let valorNodo = nodoVisitado.value;
        if(valorNodo == valorAeliminar){
            instaClass.removerNodoPorPosicion(posNodo);
            console.log("Se logro eliminar " + posNodo);
        }
        posNodo++;
        nodoVisitado = nodoVisitado.next;
    }
}
console.log(instaClass);