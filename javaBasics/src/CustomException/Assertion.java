package CustomException;

public class Assertion {

	public static void main(String[] args) {

		int withdrawAmount = 300;
		int currentBalance=100;
		
		assert(withdrawAmount < currentBalance): "withdraw amount is more than current balance";
	}

}
