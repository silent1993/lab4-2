package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tomcat.LIBB;
import dao.MyUtils;

public class BookDB implements BookDao {
	MyUtils db = new MyUtils();

	@Override
	public List<LIBB> getAllBooks(String author) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = db.getCon();
		List<LIBB> listb = new ArrayList<LIBB>();
		Statement sta = conn.createStatement();
		sta.execute("select * from BOOK where author = '" + author + "'");
		while (true) {
			ResultSet set = sta.getResultSet();
			if (set != null) {
				while (set.next()) {
					LIBB lib = new LIBB();
					lib.setAuthor(author);
					lib.setISBN(set.getInt("ISBN"));
					lib.setPrice(set.getDouble("price"));
					lib.setPub_date(set.getString("pub_date"));
					lib.setPublish(set.getString("publish"));
					lib.setTitle(set.getString("title"));
					listb.add(lib);
					continue;
				}
				sta.getMoreResults();
			}
			break;
		}
		db.closeCon(conn);
		return listb;
	}

	@Override
	public LIBB getBook(int ISBN) throws SQLException {
		// TODO Auto-generated method stub
		LIBB lib = new LIBB();
		Connection conn = db.getCon();
		Statement sta;
		sta = conn.createStatement();

		ResultSet rset = sta.executeQuery("select * from BOOK where ISBN = "
				+ ISBN + ";");
		while (rset.next()) {
			lib.setAuthor(rset.getString("author"));
			lib.setISBN(ISBN);
			lib.setPrice(rset.getDouble("price"));
			lib.setPub_date(rset.getString("pub_date"));
			lib.setPublish(rset.getString("publish"));
			lib.setTitle(rset.getString("title"));
		}
		db.closeCon(conn);
		return lib;
	}

	@Override
	public void delete(int ISBN) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = db.getCon();
		Statement sta = conn.createStatement();
		sta.executeUpdate("delete from BOOK where ISBN=" + ISBN + ";");
		db.closeCon(conn);
	}
	public void insert(String name,String title,int ISBN,double price,String publish,String pub_date)
	{
		

		Connection conn = db.getCon();
		
		try {
			
			PreparedStatement pre=conn.prepareStatement("insert into BOOK values(null,?,?,?,?,?,?)");
			pre.setString(1, name);
			pre.setString(2, title);
			pre.setDouble(3,price);
			pre.setString(4,publish);
			pre.setString(5, pub_date);
			pre.setInt(6, ISBN);
			pre.executeUpdate();
			db.closeCon(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
