
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>index</title>
        <meta charset="UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="js/metodos.js" type="text/javascript" ></script>
    </head>
    <body>
        <script>
            $(document).ready(function(){
               $('.menuContainer').load('plantilla/menu.html');
               //cargarCiudades();
               
               $('#btnGuardar').on("click", function(){
                   guardarAlumno();
               });
               
            });            
        </script>
        
        <div class="menuContainer"></div>           
        <div class="container">
                    
            <h2>Registro de Alumnos</h2>
            
            <div class="alert alert-success" role="alert" style="display:none;">
                Registro Guardado Exitosamente!
              </div>
            
            <form action="/AlumnoController" name="alumno" id="alumno" method="POST">
            <div class="form-group">
                <label>Carné </label>
                <input type="text" name="carne" id="carne" class="form-control"  placeholder="Ingrese carne" >
            </div>
            <div class="form-group">
                <label>Nombre </label>
                <input type="text" name="nombre" id="nombre" class="form-control"  placeholder="Ingrese nombre" >
            </div>
           <div class="form-group">
                <label>Correo </label>
                <input type="text" name="correo" id="correo" class="form-control"  placeholder="Ingrese correo" >
            </div>
            <div class="form-group">
                <label>Telefono </label>
                <input type="text" name="telefono" id="telefono" class="form-control"  placeholder="Ingrese telefono" >
            </div>
            <div class="form-group">
            <select name="genero" class="form-control">
                    <option > Selecione Genero </option >
                    <option value="1"> Masculino </option >
                     <option value="2" > Femenino </option >
            </select><br>
            </div>
            
            <div class="form-group">
                <select name="ciudad" id="ciudad" class="form-control">
                    <option > Selecione Ciudad </option >
                    <option value="1"> Puerto Barrios </option >
                     <option value="2" > Morales </option >
            </select><br>
            </div>
                <input type="button" id="btnGuardar" class="btn btn-primary" value="Guardar">
            <a href="#" class="btn btn-danger">Cancel</a>
        </form>
            
    </div>
    </body>
</html>
