<%-- 
    Document   : SendEmail
    Created on : Oct 11, 2023, 7:58:21 AM
    Author     : hp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ma.projet.entities.Client"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!Client c ;%>
        <%
         
        HttpSession sessio = request.getSession();
        if (sessio != null) {
             c = (Client) sessio.getAttribute("client");
        }
        else{
            response.sendRedirect("login.jsp");
        }
        %>
        <h1>Bonjour : <%= c.getNom() + " " + c.getPrenom()%> </h1>
        <form action="deconnexion">
            <input type="submit" value="Deconnixion">
        </form>

    </body>
</html>
