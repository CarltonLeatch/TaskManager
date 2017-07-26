<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Azorah</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/simple-sidebar.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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
                        <h1>Simple Sidebar</h1>
                        <p>Welcome to the start page
                        
                        <%@page import = "java.sql.Connection" %>
                        <%@page import = "dao.DBConnection" %>
                        <%@page import = "java.sql.DriverManager" %>
                        <%
                        DBConnection db = new DBConnection();
                        Connection conn = db.getConnection();
                        
                        if(conn == null)
                        	out.print("conn filed");
                        else
                        	out.print("conn succed");
                        
                        
                        
                        
                        %>
                        
                        
                        </p>
                        <a href="" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                    </div>
                </div>
            </div>
        </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>