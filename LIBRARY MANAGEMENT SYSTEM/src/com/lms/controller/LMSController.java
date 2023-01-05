package com.lms.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.bean.Book;
import com.lms.bean.Student;
import com.lms.dao.StudentDao;



public class LMSController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String actionFrom = request.getParameter("EMSButton");
		StudentDao dao = new StudentDao();
		

		if (actionFrom.equals("Insert")) {
			String sName = request.getParameter("sName");
			int sId = Integer.parseInt(request.getParameter("sId"));
			String sDept = request.getParameter("sDept");
			int sYear = Integer.parseInt(request.getParameter("sYear"));
			String bName = request.getParameter("bName");
			int bId = Integer.parseInt(request.getParameter("bId"));
			String iDate = request.getParameter("iDate");
			String rDate = request.getParameter("rDate");

			Student bean = new Student();
			bean.setsName(sName);
			bean.setsId(sId);
			bean.setsDept(sDept);
			bean.setsYear(sYear);
			bean.setbName(bName);
			bean.setbId(bId);
			bean.setiDate(iDate);
			bean.setrDate(rDate);

			try {
				int n = dao.addStudent(bean);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
					String msg = "Record Inserted";
					request.setAttribute("Insertmsg", msg);
					rd.include(request, response);

				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
					String msg = "Record not Inserted";
					request.setAttribute("Insertmsg", msg);
					rd.include(request, response);
				}
			} catch (Exception e) {
				response.sendRedirect("Fail.jsp");
			}
		}

		if (actionFrom.equals("renew")) {
			int sId = Integer.parseInt(request.getParameter("sId"));
			String rDate = request.getParameter("rDate");

			Student bean = new Student();
			bean.setsId(sId);
			bean.setrDate(rDate);
			try {
				int n = dao.updateStudent(bean);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
					String msg = "Record Updated";
					request.setAttribute("Updatemsg", msg);
					rd.include(request, response);

				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
					String msg = "Record not Updated";
					request.setAttribute("Updatemsg", msg);
					rd.include(request, response);

				}
			} catch (Exception e) {
				response.sendRedirect("Fail.jsp");
			}
		}

		if (actionFrom.equals("Delete")) {
			int sId = Integer.parseInt(request.getParameter("eid"));

			Student bean = new Student();
			bean.setsId(sId);
			try {
				int n = dao.deleteStudent(bean);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
					String msg = "Record Deleted";
					request.setAttribute("Deletemsg", msg);
					rd.include(request, response);

				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
					String msg = "Record not Deleted";
					request.setAttribute("Deletemsg", msg);
					rd.include(request, response);

				}
			} catch (Exception e) {
				response.sendRedirect("Fail.jsp");
			}
		}

		if (actionFrom.equals("Find")) {
			int sId = Integer.parseInt(request.getParameter("sId"));
			try {
				Student bean = dao.findStudent(sId);
				if (bean != null) {
					RequestDispatcher rd = request.getRequestDispatcher("findOutput.jsp");
					request.setAttribute("bean", bean);
					rd.include(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
					String msg = "Record not Found";
					request.setAttribute("Findmsg", msg);
					rd.include(request, response);

				}
			} catch (Exception e) {
				response.sendRedirect("Fail.jsp");
			}

		}
		if (actionFrom.equals("Add")) {
			String bName = request.getParameter("bName");
			int bId = Integer.parseInt(request.getParameter("bId"));
			String bAuthor = request.getParameter("bAuthor");
			int bQuantity = Integer.parseInt(request.getParameter("bQuantity"));
			

			Book bean = new Book();
			bean.setbName(bName);
			bean.setbId(bId);
			bean.setbAuthor(bAuthor);
			bean.setbQuantity(bQuantity);
			

			try {
				int n = dao.addBook(bean);
				if (n == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
					String msg = "Book details added";
					request.setAttribute("addMsg", msg);
					rd.include(request, response);

				} else {
					RequestDispatcher rd = request.getRequestDispatcher("Fail.jsp");
					String msg = "Record not Inserted";
					request.setAttribute("addMsg", msg);
					rd.include(request, response);
				}
			} catch (Exception e) {
				response.sendRedirect("Fail.jsp");
			}
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		try {
			List<Student> list = dao.displayAll();
			RequestDispatcher rd = request.getRequestDispatcher("displayAll.jsp");
			request.setAttribute("list", list);
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			List<Book> list1 = dao.bookReport();
			RequestDispatcher rd = request.getRequestDispatcher("displayAll.jsp");
			request.setAttribute("list1", list1);
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
