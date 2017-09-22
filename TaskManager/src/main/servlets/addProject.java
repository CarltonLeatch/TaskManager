package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import antlr.collections.List;
import entities.Projects;
import entities.Users;
import model.UsersModel;

/**
 * Servlet implementation class addProject
 */
@WebServlet("/addProject")
public class addProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProject() {
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
		Projects project = new Projects();
		
		project.setName(request.getParameter("ProjectName"));
		project.setDescription(request.getParameter("description"));
		
		UsersModel um = new UsersModel();
		
		Users u = new Users();
		String username = (String) session.getAttribute("Username");
		u = um.searchByUsername(username);
		if(u != null){
		project.setUser(u);
		u.getProjects().add(project);
		}
		
	//	response.getWriter().print(u.getProjects());
		um.update(u);
		u.getProjects();
		response.sendRedirect("projects.jsp");
		
	}

}
