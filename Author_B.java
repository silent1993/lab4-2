package tomcat;

public class Author_B {
	private String name;
	private String country;
	private int age;
	private int authorid;
	public Author_B(){
		
	}
	public Author_B(int authorid,String name,String country,int age){
		this.name=name;
		this.country=country;
		this.age=age;
		this.authorid=authorid;
	}
	public String getName(){
		return name;
		
	}
	public void setName(String name){
		this.name=name;
	}
	public int getId(){
		return authorid;
		
	}
	public void setID(int authorid){
		this.authorid=authorid;
	}
	public String getCountry(){
		return country;
		
	}
	public void setCountry(String country){
		this.country=country;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}

}
