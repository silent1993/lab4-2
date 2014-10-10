package dao;

import java.sql.SQLException;
import java.util.List;

import tomcat.LIBB;
public interface BookDao {
	public List<LIBB> getAllBooks(String author) throws SQLException;
	public LIBB getBook(int ISBN) throws SQLException;
	//public void update(LIBB lib);
	//public void insert(LIBB lib);
	public void delete(int ISBN) throws SQLException;
	public void insert(String name,String title,int ISBN,double price,String publish,String pub_date);
}
