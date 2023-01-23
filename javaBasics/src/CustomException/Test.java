package CustomException;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {

		//throw new UncheckedCustomException("Bussiness exception occured");
		throw new CheckedCustomException("bussiness exception that needs to be handled");
	
	}

}
