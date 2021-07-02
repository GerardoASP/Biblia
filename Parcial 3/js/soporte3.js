function compararNumeros(){
    let valorNu = document.getElementById("num1").value;
    let valorNum3 = document.getElementById("num3").value;
    let valorNum = document.getElementById("n2").value;
    let menor = 0;
    if(valorNu == valorNum && valorNum == valorNum3){
        document.getElementById("mostrarR").innerHTML = "Numeros repetidos";
    }else{
        if((valorNum < valorNu) && (valorNum3 < valorNu)){
            document.getElementById("mostrarR").innerHTML = "Los numeros ingresados en los campos 2 y 3 son menores que el primero";
        }else{
            if(valorNum < valorNum3){
                menor = valorNum;
            }else{
                if(valorNum3 < valorNum){
                    menor = valorNum3;
                }
            }

            if(menor < valorNu){
                document.getElementById("mostrarR").innerHTML = "El numero menor  es: " + menor;
            }
        }
    }
}
