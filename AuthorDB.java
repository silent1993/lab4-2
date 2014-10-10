package dao;

import tomcat.Author_B;
import dao.MyUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthorDB implements AuthorDao {
	MyUtils db = new MyUtils();

	@Override
	public Author_B geta(int id) throws Exception {
		// TODO Auto-generated method stub
		Author_B authorB = new Author_B();
		Connection conn = db.getCon();
		Statement sta = conn.createStatement();
		ResultSet set = sta.executeQuery("select * from AUTHOR_BOOK where id="
				+ id + ";");
		while (set.next()) {
			authorB.setAge(set.getInt("age"));
			authorB.setCountry(set.getString("country"));
			authorB.setName(set.getString("name"));
			authorB.setID(id);
		}
		db.closeCon(conn);
		return authorB;
	}

	@Override
	public Author_B geta(String name) throws Exception {
		// TODO Auto-generated method stub
		Author_B authorB = new Author_B();
		Connection conn = db.getCon();
		Statement sta = conn.createStatement();
		ResultSet set = sta
				.executeQuery("select * from AUTHOR_BOOK where name='" + name
						+ "';");
		while (set.next()) {
			authorB.setAge(set.getInt("age"));
			authorB.setCountry(set.getString("country"));
			authorB.setName(name);
			authorB.setID(set.getInt("id"));
		}
		db.closeCon(conn);
		return authorB;
	}
	public void insert(String name,int age,String country)
	{
		Connection conn = db.getCon();
		try {
			Statement sta = conn.createStatement();
			ResultSet set = sta
					.executeQuery("select * from AUTHOR_BOOK where name='" + name
							+ "';");
			while(set.next())
				{
				db.closeCon(conn);
				return;
				}
			PreparedStatement pre=conn.prepareStatement("insert into AUTHOR_BOOK values(null,?,?,?)");
			pre.setString(1, name);
			pre.setInt(2, age);
			pre.setString(3,country);
			pre.executeUpdate();
			db.closeCon(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
