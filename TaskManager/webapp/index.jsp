<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@page import = "java.sql.Connection" %>
 <%@page import = "dao.DBConnection" %>

 <%@page import = "entities.Users" %>
   <%@page import = "model.UsersModel" %>
  
<%@page import = "java.sql.DriverManager" %>
<%@page import = "java.sql.Statement" %>
<%@page import = "java.sql.ResultSet" %>

<%@page import = "org.hibernate.Session" %>
<%@page import = "org.hibernate.SessionFactory" %>
<%@page import = "org.hibernate.Transaction" %> 
<%@page import = "org.hibernate.cfg.Configuration"%>



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
       <jsp:include page = "menu.jsp" /> 
        
    
    <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>Connections:</h1>
                        <p>Connection with MySql: 
                        
                        <%
                       // DBConnection db = new DBConnection();
                      //  Connection conn = db.getConnection();
                                             
                        
                        
                      /*  Statement statement = conn.createStatement();
                        
                        String insert = "CREATE TABLE IF NOT EXISTS `taskmanager`.`users` ( "
                        		+"  `user_id` INT NOT NULL AUTO_INCREMENT, "
                        		+"  `username` VARCHAR(45) NOT NULL,"
                        		+"  `password` VARCHAR(45) NOT NULL,"
                        		+"  `Email` VARCHAR(45) NOT NULL,"
                        		+"  PRIMARY KEY (`user_id`),"
                        		+"  UNIQUE INDEX `username_UNIQUE` (`username` ASC),"
                        		+"  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC));";

                        
         				statement.executeUpdate(insert);
         				
         				UserService userdb = new UserService();
         				
         				String get = "Select username,password from users";
         				
         				ResultSet rs = statement.executeQuery(get);
         				
         				if(rs.next()){
         					User u = new User();
         					u.setUsername(rs.getString(1));
         					u.setPassword(rs.getString(2));
         					
         					userdb.getAll().add(u);
         				}
                        
                        if(conn == null)
                        	out.print("conn filed");
                        else
                        	out.print("conn succed");
                        
                        
                        
                        conn.close();
                        
                        
                      */
                       
                        
                      
                        %>
                     
                        
                        
                        </p>
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