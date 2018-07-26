package com.ibm.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.dao.DepartmentDAO;
import com.ibm.model.Department;

/**
 * Servlet implementation class DepartmentController
 */
@WebServlet("/departments")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get the location id from the form
		int locId=Integer.parseInt(request.getParameter("loc"));
		//Get the list of departments by using DAO
		DepartmentDAO dao=new DepartmentDAO();
		ArrayList<Department> depts=dao.getDeptbyLoc(locId);
		//Add the list as a request attribute
		request.setAttribute("depts", depts);
		//forward the request
		RequestDispatcher disp=request.getRequestDispatcher("Departmentlist2.jsp");
		disp.forward(request, response);
		
	}

}
