package controller;

import java.sql.SQLException;
import java.util.List;






import tomcat.LIBB;
import tomcat.Author_B;
import dao.AuthorDB;
import dao.BookDB;

import com.opensymphony.xwork2.ActionSupport; 


public class LIBBAction extends ActionSupport {
    private static final long serialVersionUID = -6886717038958300000L;  
    private LIBB lib;
    private List<LIBB> listb;
    private Author_B author;
    private AuthorDB authordb;
    private BookDB bookdb;
   
    
    private int ISBN;
    private String name;
    private String title;
    private double price;
    private String publish;
    private String pub_date;
    
    private int age;
    private String country;
    public  LIBBAction(){
    	authordb=new AuthorDB();
    	bookdb=new BookDB();
    }
    
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getPub_date() {
		return pub_date;
	}

	public void setPub_date(String pub_date) {
		this.pub_date = pub_date;
	}

	public String getName(){
    	return name;
    }
    public void setName(String name){
    	this.name=name;
    }
    public List<LIBB> getlist(){
    	return listb;
    }
    public LIBB getLib(){
    	return lib;
    	
    }
    public void setLib(LIBB lib){
    	this.lib=lib;
    }
    public List<LIBB> getListb()
    {
    	return listb;
    }
    public void setList(List<LIBB> listb)
    {
    	this.listb=listb;
    }
    public Author_B getAuthor(){
    	return author;
    }
    public void setAuthor(Author_B author)
    {
    	this.author=author;
    	
    }
    public String search() throws SQLException{
    	lib=bookdb.getBook(ISBN);
    	try {
			author=authordb.geta(lib.getAuthor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	return SUCCESS;
    }
    public String list() throws Exception{
    	author=authordb.geta(name);
    	listb=bookdb.getAllBooks(author.getName());
    	return SUCCESS;
    }
	public String delete() throws SQLException {
		bookdb.delete(ISBN);
		return SUCCESS;
	}
	public String insert(){
		bookdb.insert(name, title, ISBN, price, publish, pub_date);
		authordb.insert(name, age, country);
		return SUCCESS;
	}
	public String back(){
		return SUCCESS;
	}

	
}



