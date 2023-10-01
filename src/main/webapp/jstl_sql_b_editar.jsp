<%-- 
    Document   : jstl_sql_b_editar
    Created on : 30/09/2023, 08:35:41 PM
    Author     : User
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
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
        <%
            String nombre = request.getParameter("nombre");
            String clave = request.getParameter("clave");
            String estado = request.getParameter("estado");
            String codigo = request.getParameter("codigo");
            System.out.println(codigo);
        %>
        <form action="ControladorEditar">
            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Nombre</span>
              <input type="text" name="nombre" class="form-control" value="<%= nombre %>" aria-label="Numero1" aria-describedby="basic-addon1">
            </div>
            <div class="input-group mb-3">
              <span class="input-group-text" id="basic-addon1">Clave</span>
              <input type="text" name="clave" class="form-control" value=" <%= clave%> " aria-label="Numero1" aria-describedby="basic-addon1">
            </div>
            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon1">Estado</span>
                <select name="estado" class="form-select"  >
                    <%
                        if (estado.equals('A'))
                        {
                            out.print("<option value=\"A\" class=\"form-control\" selected=\"selected\">A</option>");
                            out.print("<option value=\"X\" class=\"form-control\">X</option>");
                        }
                        else if(estado.equals('B'))
                        {
                            out.print("<option value=\"A\" class=\"form-control\" >A</option>");
                            out.print("<option value=\"X\" class=\"form-control\" selected=\"selected\">X</option>");   
                        }
                        else
                        {
                            out.print("<option value=\"A\" class=\"form-control\" >A</option>");
                            out.print("<option value=\"X\" class=\"form-control\" selected=\"selected\">X</option>");                        
                        }
                    %>
                </select>
            </div>
            <input type="hidden" name="codigo" value="<%= codigo%>">
            <button type="submit" class="btn btn-warning">Confirmar cambios</button>
        </form>
        <button type="button" class="btn btn-danger"><a href="jstl_sql_a.jsp" style="text-decoration: none;">Cancelar</a></button>

    </body>
</html>
