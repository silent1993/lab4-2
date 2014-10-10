package dao;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class MyUtils {

	private static final String url ="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_heyuqi";
	private static final String dbdriver = "com.mysql.jdbc.Driver";
	private static final String user = "owx3xl15w4";
	private static final String password = "301zhw0hikmmyyhzmiyzm153wy2ymx4w1i5kx20h";

	public Connection getCon()  {
		Connection con = null; // 表示数据库的连接对象 

		try {
			Class.forName(dbdriver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 1、使用CLASS 类加载驱动程序

			// TODO Auto-generated catch block
		return con;
	}
	public void closeCon(Connection con) throws SQLException
	{
		/*if(!con.isClosed()){
			System.out.println("Success");
		}
		else if(con.isClosed())
		{
			System.out.println("fail");
		}*/
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		//con.close(); // 3、关闭数据库
	}
	

}
