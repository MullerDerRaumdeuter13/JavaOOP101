package JavaOOP101;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty=0;
	
	public Book(String name, Author author, double price, int qty) {
		this.name=name;this.author=author;this.price=price;this.qty=qty; }
	
	public Book(String name, Author author, double price) {
		this.name=name;this.author=author;this.price=price;}
	
	

}
