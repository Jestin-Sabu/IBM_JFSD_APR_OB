import com.ibm.lib.Book;
import com.ibm.lib.LibraryException;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("Book 1");
		Book b2 = new Book("Book 2");
		Member m1 = new Member("Jestin");
		Member m2 = new Member("Sabu");

		try {
			b1.issueBook(m1);
		} catch (LibraryException le) {
			System.out.println(le.getMessage());
		}

		try {
			b2.issueBook(m2);
		} catch (LibraryException le) {
			System.out.println(le.getMessage());
		}

		try {
			b2.returnBook(m1);
		} catch (LibraryException le) {
			System.out.println(le.getMessage());
		}

		try {
			b2.returnBook(m2);
		} catch (LibraryException le) {
			System.out.println(le.getMessage());
		}

	}

}
