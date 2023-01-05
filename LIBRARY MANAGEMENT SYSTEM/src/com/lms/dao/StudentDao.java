package com.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lms.bean.Book;
import com.lms.bean.Student;
import com.lms.util.DBUtil;



public class StudentDao {
	
	public int addBook(Book bean) throws Exception {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into book_table values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bean.getbName());
		ps.setInt(2, bean.getbId());
		ps.setString(3, bean.getbAuthor());
		ps.setInt(4, bean.getbQuantity());

		int n = ps.executeUpdate();
		return n;
		
	}
	
	
	public int addStudent(Student bean) throws Exception {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into lms_table values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bean.getsName());
		ps.setInt(2, bean.getsId());
		ps.setString(3, bean.getsDept());
		ps.setInt(4, bean.getsYear());
		ps.setString(5, bean.getbName());
		ps.setInt(6, bean.getbId());
		ps.setString(7, bean.getiDate());
		ps.setString(8, bean.getrDate());

		int n = ps.executeUpdate();
		return n;
		
	}
	public int updateStudent( Student bean1) throws Exception {
		Connection con = DBUtil.getDBConnection();
		String sql = "update lms_table set RenewalDate=? where sId=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bean1.getrDate());
		ps.setInt(2, bean1.getsId());
		

		int n = ps.executeUpdate();
		return n;
	}
	public int deleteStudent(Student bean2) throws Exception{
		Connection con = DBUtil.getDBConnection();
		String sql = "delete from lms_table where sId=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bean2.getsId());
		int n = ps.executeUpdate();

		return n;
		
	}
	public Student findStudent(int sId) throws Exception {
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from lms_table where sId=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, sId);
		ResultSet rs = ps.executeQuery();
		Student e = null;
		if(rs.next()) {
			e = new Student();
			e.setsName(rs.getString("sName"));
			e.setsId(rs.getInt("sId"));
			e.setsDept(rs.getString("sDept"));
			e.setsYear(rs.getInt("sYear"));
			e.setbName(rs.getString("bName"));
			e.setbId(rs.getInt("bId"));
			e.setiDate(rs.getString("IssueDate"));
			e.setrDate(rs.getString("RenewalDate"));

		}
		return e;
	}
	public List<Student> displayAll() throws Exception {
		ArrayList empList = new ArrayList();
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from lms_table";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Student e = new Student();
			e.setsName(rs.getString("sName"));
			e.setsId(rs.getInt("sId"));
			e.setsDept(rs.getString("sDept"));
			e.setsYear(rs.getInt("sYear"));
			e.setbName(rs.getString("bName"));
			e.setbId(rs.getInt("bId"));
			e.setiDate(rs.getString("IssueDate"));
			e.setrDate(rs.getString("RenewalDate"));
			empList.add(e);
		}

		return empList;
	}
	public List<Book> bookReport() throws Exception {
		ArrayList bookList = new ArrayList();
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from book_table";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Book b = new Book();
			b.setbName(rs.getString("bName"));
			b.setbId(rs.getInt("bId"));
			b.setbAuthor(rs.getString("bAuthor"));
			b.setbQuantity(rs.getInt("bQuantity"));

			bookList.add(b);
		}

		return bookList;
	}
	public int exit() {
		return 0;	
	}
}
