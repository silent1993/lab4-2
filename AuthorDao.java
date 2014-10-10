package dao;



import tomcat.Author_B;

public interface AuthorDao {
	public Author_B geta(int id) throws Exception;
	public Author_B geta(String name) throws Exception;
	public void insert(String name,int age,String country);
}
