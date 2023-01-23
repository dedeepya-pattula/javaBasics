package ExceptionalHandling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args)  {

		try {
		FileInputStream fis = new FileInputStream("");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	}

}
