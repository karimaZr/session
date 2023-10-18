<%-- 
    Document   : SendEmail
    Created on : Oct 11, 2023, 7:58:21 AM
    Author     : hp
--%>
<%@page import="ma.projet.service.EmployeeService"%>
<%@page import="ma.projet.entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://fonts.bunny.net/css?family=Nunito" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="card">
                        <div class="card-header">Modifier  le  mot de passe </div>

                        <div class="card-body">

                            <form method="POST" action="Update">
                                <div class="row mb-3">
                                     <label class="col-md-4 col-form-label text-md-end">Password :</label>
                                  <div class="col-md-6">
                                       <input type="password" name="password" class="form-control" required   />
                                    </div>
                                </div>
                                 <div class="row mb-3">
                                     <label class="col-md-4 col-form-label text-md-end">Confirmer password :</label>                                  
                                  <div class="col-md-6">
                                      <input type="password" name="passwordConf" class="form-control"  required />
                                    </div>
                                </div>

                                <p class="bg-danger"><%= (request.getParameter("msg") != null ? request.getParameter("msg") : "")%></p>
                              
                                <div class="row mb-0">
                                    <div class="col-md-6 offset-md-4">
                                        <button type="submit" value="" class="btn btn-primary">
                                            Valider
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>

