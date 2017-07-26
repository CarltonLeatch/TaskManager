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
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="index.jsp">
                        Azorah.pl
                    </a>
                </li>
                <li>
                    <a href="dashboard.jsp">Dashboard</a>
                </li>
                <li>
                    <a href="inbox.jsp">Inbox</a>
                </li>
                <li>
                    <a href="pojects.jsp">Projects</a>
                </li>
                <li>
                    <a href="index.jsp">Logout</a>
                </li>
                
            </ul>
        </div>
        
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <form method = "post" action = "register">
					<label>Login: <input type = "text" id ="login" name = "login" /></label><br/>
					<label>Password: <input type = "text" id ="password" name = "password" /></label><br/>
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