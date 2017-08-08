package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import dao.DBConnection;
import dao.User;
import services.UserService;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
@Stateless
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@PersistenceContext
	EntityManager em;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String passwordConfi = request.getParameter("passwordConfi");
		
		PasswordConfirm(password,passwordConfi);
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
		
		
		UserService userDB = new UserService();
		
		userDB.getAll().add(user);
		
		DBConnection db = new DBConnection();
        Connection conn = db.getConnection();
        
        Statement statement;
		
			try {
				statement = conn.createStatement();
				String insert = "Insert into users(username,password, email) VALUES ('"+username+"','"+password+"','"+email+"');";
		        
				statement.executeUpdate(insert);
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
        
        
		
		response.getWriter().println(userDB.getAll());
		
		
		
	}
	
	private boolean PasswordConfirm(String password, String PasswordConfirm){
		if(password.equals(PasswordConfirm))
			return true;
		return false;
	}

}


/*
 * 
 *    <%@page import = "java.sql.Connection" %>
                        <%@page import = "dao.DBConnection" %>
                        <%@page import = "java.sql.DriverManager" %>
                        <%@page import = "java.sql.Statement" %>
                        <%
                        DBConnection db = new DBConnection();
                        Connection conn = db.getConnection();
                        
                        Statement statement = conn.createStatement();
                        
                        String insert = "Insert into users(username,password) VALUES ('Rafal','Ochot');";
                        
         				statement.executeUpdate(insert);
         				
                        
                        if(conn == null)
                        	out.print("conn filed");
                        else
                        	out.print("conn succed");
                        
                        
                        
                        
                        %>
*/