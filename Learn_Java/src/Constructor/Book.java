package Constructor;

public class Book {

	public String title;
	String author;
	double price;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public Book(String title,String author,double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public static void main(String[] args) {
		Book a=new Book("ABC","CDE");
		System.out.print("title : "+a.title+" ");
		System.out.print("Author :"+a.author+" ");
		System.out.println("price :"+a.price);
		
		Book b=new Book("XYZ","OPN",5214);
		System.out.print("title : "+b.title+" ");
		System.out.print("Author :"+b.author+" ");
		System.out.println("price :"+b.price);
	}

}
