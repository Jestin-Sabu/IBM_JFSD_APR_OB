import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReadDemo {

	public static void main(String[] args) {
		String path = "src/amazing.txt";
		
		FileInputStream istream = null;
		
		try {
			istream = new FileInputStream(path);
			byte[] content = new byte[istream.available()];
			istream.read(content);
			System.out.println(new String(content));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				istream.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
