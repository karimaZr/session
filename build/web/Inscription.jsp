<%-- 
    Document   : Inscription
    Created on : Oct 11, 2023, 5:49:18 AM
    Author     : hp
--%>

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
                        <div class="card-header">Inscription</div>

                        <div class="card-body">
                            <form action="Inscription" method="POST">
                                <div class="row mb-3">
                                    <label  class="col-md-4 col-form-label text-md-end">Nom</label>

                                    <div class="col-md-6">
                                        <input id="name" type="text" class="form-control" name="nom" value="" >

                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="name" class="col-md-4 col-form-label text-md-end">Prenom</label>

                                    <div class="col-md-6">
                                        <input id="name" type="text" class="form-control" name="prenom" value="" >

                                    </div>
                                </div>
                               
                               

                                <div class="row mb-3">
                                    <label for="email" class="col-md-4 col-form-label text-md-end">Email</label>

                                    <div class="col-md-6">
                                        <input id="email" type="email" class="form-control " name="email" value="">


                                    </div>
                                </div>
                                

                                <div class="row mb-3">
                                    <label for="password" class="col-md-4 col-form-label text-md-end">Date</label>

                                    <div class="col-md-6">
                                        <input id="password" type="date" class="form-control " name="date" >

                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <label for="email" class="col-md-4 col-form-label text-md-end">Mot de passe</label>

                                    <div class="col-md-6">
                                        <input id="email" type="password" class="form-control " name="password" value="">


                                    </div>
                                </div>


                                <div class="row mb-0">
                                    <div class="col-md-6 offset-md-4">
                                        <input type="submit" value="Valider" class="btn btn-primary">

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
