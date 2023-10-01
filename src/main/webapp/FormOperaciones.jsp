<%-- 
    Document   : FormOperaciones
    Created on : 30/09/2023, 06:35:30 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" 
              href="webjars/bootstrap/5.1.2/css/bootstrap.min.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RESOLVER OPERACIONES BASICAS CON 2 NUMEROS</h1>
        <form action="/WebJava05/Controlador2">
            
            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Numero 1</span>
              <input type="number" name="numero1" class="form-control" placeholder="Ingrese un numero" aria-label="Numero1" aria-describedby="basic-addon1">
            </div>
            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Numero 2</span>
              <input type="number" name="numero2" class="form-control" placeholder="Ingrese un numero" aria-label="Numero2" aria-describedby="basic-addon1">
            </div>
            <a href="url"></a>
            <select name="operacion" class="form-select"  >
                <option value="suma" class="form-control" selected="selected">Sumar</option>
                <option value="resta">Restar</option>
                <option value="multiplicacion">Multiplicar</option>
                <option value="division">DIvidir</option>
            </select><br>
            <button type="submit" class="btn btn-danger">Calcular</button>
        </form>
    </body>
</html>
