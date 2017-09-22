<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page import = "entities.*" %>
    <%@page import = "model.*" %>
    <%@page import = "java.util.List" %>
    <%@page import = "java.util.ArrayList" %>
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
       <jsp:include page = "menu.jsp" /> 
        
    
    <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="container">
                    <div class="col-sm-6">
                     
                    <% Users u = new Users(); 
                    UsersModel um = new UsersModel();
                    
                    u = um.searchByUsername((String) session.getAttribute("Username"));
                    
                    List<Projects> lp = new ArrayList<Projects>();
                    
                    lp = u.getProjects();
                    
                    request.setAttribute("lp", lp);
                    %>
                	
    			<div class="row pricing" >
								<h1  style = "text-align: center" >Your projects:</h1>
								<c:forEach items="${lp}" var="comments">
								
									<div class="col-sm-12"  style = "text-align: center" >
										<div class="well">
											<h3><b>Project name: ${comments.getName()}</b></h3>
											<hr>
											<p>Description: ${comments.getDescription()}</p>										
											<a style = "text-align: left" href = "project?id=${comments.getProject_id()}">More details</a>
											</div>
											</div>
											<br>
									
									</c:forEach>
								
								</div>
												
                    </div>
                   				<div class = "col-sm-6">
                  			 	<h1>New Project:</h1>
                  			 	<form action = "addProject" method = "POST">
                  			 	<div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="ProjectName">Project name:</label>
      <div class="controls">
        <input type="text" id="ProjectName" name="ProjectName" placeholder="" class="input-xlarge">
        <p class="help-block">Project can contain any letters or numbers, without spaces</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="Description">Description</label>
      <div class="controls">
        <input type="textarea" id="description" name="description" placeholder="" class="input-xlarge">
        <p class="help-block">Short description about project</p>
      </div>
    </div>
 <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-success">Add project !!</button>
      </div>
    </div>
   
                  			 	</form>
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