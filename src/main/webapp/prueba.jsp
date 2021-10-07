<%-- 
    Document   : prueba
    Created on : 6/10/2021, 5:55:37 a. m.
    Author     : AlvarezCuadros
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Persistencia.AutorizacionDAO"%>
<%@page import="Logica.ColeccionAutorizacion"%>
<%@page import="Logica.Autorizacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
        <!-- ////////////////////// BOOTSTRAP HREF /////////////////////////////////-->
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
        
    </head>
    <body>
        <div class="container"; align="center">
            <h2>Autorizaciones</h2>
        </div>
        <div class="container">
            <table class="table table-striped">
                <thead>
                  <tr>
                    <td width="15%">Autorizacion ID</td>
                    <td>Entidad</td>
                    <td>Paciente</td>
                    <td>Fecha</td>
                    <td>Estado</td>
                  </tr>
                </thead>
                <%
                    ColeccionAutorizacion coleccion = new ColeccionAutorizacion();
                    boolean hayDatos = coleccion.cargarAutorizaciones();
                %>
                <tbody>
                <%if (hayDatos){%>
                <%for(Autorizacion a: coleccion.getLista()){%>
                    <tr>
                      <td><%= a.getAutorizacion_Id() %></td>
                      <td><%= a.getAutorizacion_Nombre_Entidad()%></td>
                      <td><%= a.getAutorizacion_Id_Paciente()%></td>
                      <td><%= a.getAutorizacion_fecha()%></td>
                      <td><%= a.getAutorizacion_Estado_Id() %></td>
                    </tr>
                    
                <% }}else{ %>
                    <tr>
                        <td colspan="10" >No hay datos</td>
                    </tr>
                    
                    <%}%>
                </tbody>
                    
            </table>
        </div>
    </body>
</html>
