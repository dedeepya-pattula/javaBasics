import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream(new File("d/input"));
			System.out.println("file opened");
			
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char) i);
				
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\nfile closed");
		}
	}

}
