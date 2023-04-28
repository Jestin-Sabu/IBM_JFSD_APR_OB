
public class Library {

	public static void main(String[] args) {
		Book b1 = new Book("Book 1");
		Book b2 = new Book("Book 2");
		Member m1 = new Member("Jestin");
		Member m2 = new Member("Sabu");
		
		b1.issueBook(m1);
		b2.issueBook(m2);
		
//		b1.status();
//		b2.status();
		
		b2.returnBook(m1);
		b2.returnBook(m2);
		

	}

}
