<%-- 
    Document   : welcome
    Created on : Oct 11, 2023, 5:58:35 AM
    Author     : hp
--%>

<%@page import="ma.projet.entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
            response.sendRedirect("Authentification.jsp");
        }
        %>
        <h1>Welcome MR : <%= c.getNom() + " " + c.getPrenom()%> </h1>
        <form action="deconnexion">
            <input type="submit" value="deconnixion">
        </form>

    </body>
</html>


