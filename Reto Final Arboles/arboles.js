class Node {
    constructor(valor){
        this.valor=valor;
        this.punteroDerecha=null;
        this.punteroIzquierda=null;
    }
}

class Arbol_Binario {
    constructor(){
        this.raiz=null;
    }

    añadirElemento(añadido){
        if(!this.raiz){
            /* crear raiz */
            this.raiz=new Node(añadido);
            return this;
        }
        let nodoActual=this.raiz;
        while(nodoActual){
            /* añadirlo al lado izquierdo */
            if(añadido < nodoActual.valor){
                if(nodoActual.punteroIzquierda){
                    nodoActual=nodoActual.punteroIzquierda;
                }else{
                    nodoActual.punteroIzquierda=new Node(añadido);
                    return this;
                }
            }else{/* añadir al lado derecho */
                if(nodoActual.punteroDerecha){
                    nodoActual=nodoActual.punteroDerecha;
                }else{
                    nodoActual.punteroDerecha=new Node(añadido);
                    return this;
                }
            }
        }
    }

    encontrarNodo(valorEncontrar,node=this.raiz){
        if(node === null) return null;
        else if(valorEncontrar < node.valor){
            return this.econtrarNodo(valorEncontrar,node.punteroIzquierda);
        }else if(valorEncontrar > node.valor){
            return this.encontrarNodo(valorEncontrar,node.punteroDerecha);
        }else{
            return node;
        }
    }

    eliminarNodo(valorEliminar,node=this.raiz){
       if(!node){
           return null;
       } 
       if(node.valor === valorEliminar){
            /* validar si el nodo tiene hijos */
            if(!node.punteroIzquierda & !node.punteroDerecha){
                return null;
            }else if(!node.punteroDerecha){
                return node.punteroIzquierda;
            }else if(!node.punteroIzquierda){
                return node.punteroDerecha;
            }
            /* el valor que devuelve se reemplaza por el nodo eliminado */
            let nodoActual = this.encontrarNodoValorMenor(node.punteroDerecha);
            node.valor=nodoActual.valor;
            node.punteroDerecha=this.eliminarNodo(nodoActual.valor,node.punteroDerecha);
            return node;
       }else if(node.valor < valorEliminar){
           node.punteroDerecha = this.eliminarNodo(valorEliminar,node.punteroDerecha);
           return node;
       }else if(node.valor > valorEliminar){
           node.punteroIzquierda = this.eliminarNodo(valorEliminar,node.punteroIzquierda);
           return node;
       }
    }

    /* funcion auxiliar de eliminarNodo */
    encontrarNodoValorMenor(node=this.raiz){
        if(!node){
            return null;
        }
        while(node.punteroIzquierda){
            node=node.punteroIzquierda;
        }
        return node;
    }

    inOrden(node,fn){
        if(node !== null){
            this.inOrden(node.punteroIzquierda,fn);
            fn.call(null,node);
            this.inOrden(node.punteroDerecha,fn);
        }
    }

    postOrden(node,fn){
        if(node !== null){
            this.postOrden(node.punteroIzquierda,fn);
            this.postOrden(node.punteroDerecha,fn);
            fn.call(null,node);
        }
    }

    preOrden(node,fn){
        if(node !== null){
            fn.call(null,node);  
            this.preOrden(node.punteroIzquierda,fn);
            this.preOrden(node.punteroDerecha,fn);
        }
    }
}



let arbolito=new Arbol_Binario();
let valoresArbolito = [];

function capturarValor(){
    let valorN = document.getElementById("valorNodo").value;

    if(valoresArbolito.includes(valorN)){
        alert("El numero ingresado "+valorN+"ya se encuentra en el arbol");
    }else{
        if(!arbolito.raiz){
            valoresArbolito.push(valorN);
            arbolito.añadirElemento(valorN);
            d3.select("body").append("svg").attr("width", 50).attr("height", 50).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "purple");
            d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
        }else{
            //if(valorN > arbolito.raiz.valor){
                //valoresArbolito.push(valorN);
                //arbolito.añadirElemento(valorN);
                //d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "orange");
                //d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
            //}else{
                //valoresArbolito.push(valorN);
                //arbolito.añadirElemento(valorN);
                //d3.select("body").append("svg").attr("width", 50).attr("height", 50).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "blue");
                //d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
            //}
            if(valorN > arbolito.raiz.valor){
                if(!arbolito.punteroDerecha){
                    valoresArbolito.push(valorN);
                    arbolito.añadirElemento(valorN);
                    d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "orange");
                    d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
                }else{
                    if(valorN > arbolito.punteroDerecha.valor){
                        valoresArbolito.push(valorN);
                        arbolito.añadirElemento(valorN);
                        d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "blue");
                        d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
                    }else{
                        valoresArbolito.push(valorN);
                        arbolito.añadirElemento(valorN);
                        d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "yellow");
                        d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
                    }
                }
            }else{
                if(!arbolito.punteroIzquierda){
                    valoresArbolito.push(valorN);
                    arbolito.añadirElemento(valorN);
                    d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "red");
                    d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
                }else{
                    if(valorN > arbolito.punteroIzquierda.valor){
                        valoresArbolito.push(valorN);
                        arbolito.añadirElemento(valorN);
                        d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "blue");
                        d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
                    }else{
                        valoresArbolito.push(valorN);
                        arbolito.añadirElemento(valorN);
                        d3.select("body").append("svg").attr("width", 60).attr("height", 60).append("circle").attr("cx", 25).attr("cy", 25).attr("r", 25).style("fill", "yellow");
                        d3.select("body").append('text').text(valorN).attr('y', 50).attr('x', 30);
                    }
                }
            }
        }
    }
}


console.log(valoresArbolito);
console.log(arbolito);
/* función de añadir valores */
/*arbolito.añadirElemento(15);
arbolito.añadirElemento(25);
arbolito.añadirElemento(10);
arbolito.añadirElemento(7);
arbolito.añadirElemento(22);
arbolito.añadirElemento(17);
arbolito.añadirElemento(13);
arbolito.añadirElemento(5);
arbolito.añadirElemento(9);
arbolito.añadirElemento(27);
console.log(arbolito);  */


/* función de buscar valores */
//console.log(arbolito.encontrarNodo(25));

/* InOrden */
//let inOrden=[];
//arbolito.inOrden(arbolito.raiz,(node)=>inOrden.push(node.valor));
//console.log(inOrden);
/* postOrden */
//let postOrden=[];
//arbolito.postOrden(arbolito.raiz,(node)=>postOrden.push(node.valor));
//console.log(postOrden);
/* preOrden */
//let preOrden=[];
//arbolito.preOrden(arbolito.raiz,(node)=>preOrden.push(node.valor));
//console.log(preOrden);