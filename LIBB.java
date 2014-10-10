package tomcat;



public class LIBB {
	private String title;
	private String  author;
	private double price;
	private String pub_date;
	private String publish;
	private int ISBN;

	public LIBB() {

	}

	public LIBB(String title, String author, String pub_date, double price,String publish, int ISBN) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pub_date = pub_date;
		this.publish = publish;
		this.ISBN = ISBN;

	}

	// Property access
	// price
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// author
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// pub_date
	public String getPub_date() {
		return pub_date;
	}

	public void setPub_date(String pub_date) {
		this.pub_date = pub_date;
	}

	// ISBN
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	// author
	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

}
