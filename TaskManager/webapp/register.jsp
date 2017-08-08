<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<title>Dashboard</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/simple-sidebar.css" rel="stylesheet">


</head>
<body>
<div id="wrapper" class = "toggled">

        <!-- Sidebar -->
     <jsp:include page = "menu.jsp" /> 
        
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <form method = "post" action = "register">
					<label>Username: <input type = "text" id ="username" name = "username" /></label><br/>
					<label>E-mail: <input type = "email" id = "email" name = "email"/></label><br/>
					<label>Password: <input type = "text" id ="password" name = "password" /></label><br/>
					<label>Confirm password: <input type = "text" id ="passwordConfi" name = "passwordConfi" /></label><br/>
					<input type = "submit" value = "wyslij"/>
					</form>
                    </div>
                </div>
            </div>
        </div>
        
        
        <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    
        
</body>
</html>