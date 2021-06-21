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

    removerNodoPorValor(valor) {
        let nodoVisitado = this.head;
        let nodoAnteriorAlVisitado = null;
        while (nodoVisitado !== null) {
            if (nodoVisitado.value === valor) {
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
}

let instaClass = new listasSimples();
instaClass.anadirFinal(1);
instaClass.anadirFinal(2);
instaClass.anadirFinal(3);
instaClass.anadirFinal(4);
instaClass.anadirFinal(5);

instaClass.eliminarNodosPares();
console.log(instaClass);