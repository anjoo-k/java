package test5;

public class Book {
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {
		super();
	}

	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher + ", ";
		this.discountRate = discountRate;
	}
	
	public Book(String title, String author, int price, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = "";
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public double discount() {
		double discountPrice = getPrice() * (1 - getDiscountRate());
		return discountPrice;
	}

	@Override
	public String toString() {
		return title + ", " + author + ", " + publisher + price + "원, "
				+ (int)(discountRate * 100) + "% 할인";
	}
	
	
	
	
	
	

}
