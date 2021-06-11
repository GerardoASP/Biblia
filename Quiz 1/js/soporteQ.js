function mostrarMensaje(){
    let nombreUsuario = document.getElementById("nameU").value;
    let apellidoUsuario = document.getElementById("lastNameU").value;
    let correoUsuario = document.getElementById("emailU").value;
    let telefonoUsuario = document.getElementById("numberU").value;
    let direccionC = document.getElementById("addressU").value;
    let direccionO = document.getElementById("addressU2").value;

    let inicio = "Los datos ingresados por el usuario fueron: " + "\n";
    document.getElementById("mostrarDatos").innerHTML = inicio + "\n" + "i. Nombre completo: " + nombreUsuario + " " + apellidoUsuario + "\n" 
    + "ii. Correo electrónico: " + correoUsuario + "\n" + "iii. Número de Contacto: " + telefonoUsuario + "\n"
    + "iv. Dirección Casa: " + direccionC + "\n" + "v. Dirección opcional: " + direccionO;
}