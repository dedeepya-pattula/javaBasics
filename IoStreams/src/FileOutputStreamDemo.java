import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis =null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("d/input"));
			fos = new FileOutputStream(new File("d/input"));
			//int data;
			
			//System.out.println("file opened");
			
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
				
			}
			System.out.println("file copied");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			//System.out.println("\nfile closed");
		}
	}

}
