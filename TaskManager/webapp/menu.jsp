<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                
                    <a href="index.jsp">
                        Azorah.pl
                    </a>
                </li>
                <c:choose>
                	<c:when test = "${sessionScope.LoggedIn == true}">
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
                		    <a href="logout?param=logout">Logout</a>
               			</li>
                	</c:when>
                	<c:otherwise>
                <li>
                    <a href="register.jsp">Register</a>
                </li>
                
                <li>
                    <a href="Login.jsp">Login</a>
                </li>
                </c:otherwise>
                 </c:choose>
            </ul>
        </div>