package com.lms.util;

import java.sql.*;

public class DBUtil {
	public static Connection getDBConnection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "root");
	return con;
}
}