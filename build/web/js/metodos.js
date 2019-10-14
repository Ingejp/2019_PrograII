function guardarAlumno(){
    $.ajax({
        url:"AlumnoController",//servlet destino 
        dataType: "html", //tipo de respuesta
        data: "control=INSERT&"+$("#alumno").serialize(),//datos se envían al server
        method:"POST",
        success: function(respuesta){
            if(respuesta=1){ 
                mostrarMensajeExitoso();
                ocultarMensajeExitoso();
                limpiarFormulario();    
            }else{
                mostrarMensajeError();
                ocultarMensajeError();
            }
        },
        error: function(objAjax, estado, excepcion){
            alert("error en la comunicación");
        }
    });
 }
 
 function cargarCiudades(){
    $.ajax({
        url:"AlumnoController",//servlet destino 
        dataType: "html", //tipo de respuesta
        data: "control=CIUDADES",//datos se envían al server
        method:"POST",
        success: function(respuesta){
            if(respuesta=1){ 
                $("#ciudad").append(respuesta);   
            }else{
                mostrarMensajeError();
                ocultarMensajeError();
            }
        },
        error: function(objAjax, estado, excepcion){
            alert("error en la comunicación");
        }
    });
 }

function mostrarMensajeExitoso(){
     //$("#exito").fadeIn(300);
     //$('.toast').toast('show')
     $('.alert').fadeIn(2000);
     $('.alert').fadeOut(2000);
 }
 
 function ocultarMensajeExitoso(){
     setTimeout(function() {
        $("#exito").fadeOut(500);
       },1500);
 }
 
 function mostrarMensajeError(){
     $("#MensajeError").fadeIn(300);
 }
 
 function ocultarMensajeError(){
     setTimeout(function() {
        $("#MensajeError").fadeOut(500);
       },1500);
 }

function limpiarFormulario(){
        $("#carne").val("");
        $("#nombre").val("");
        $("#telefono").val("");
        $("#correo").val("");
}