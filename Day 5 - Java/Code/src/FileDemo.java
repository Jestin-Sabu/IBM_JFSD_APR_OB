import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String path = "src\\amazing.txt";
//		String path = "C:\\Workbench\\GitHub\\IBM-JFSD-APR-OB";
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			
			if(file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.canExecute());
				
				Date date = new Date(file.lastModified());
				System.out.println(date);
				
				System.out.println(file.length());
			}
			else {
				System.out.println("Contents of the directory");
				String[] contents = file.list();
				for(String f:contents) {
					System.out.println(f);
				}
				}
		}

	}

}
