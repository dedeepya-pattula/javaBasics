package DataTypes;

public class BankAccount {

	static String bankName = "BOA";
	String accountHolderName;
	String accountNumber;
	float balance;

	public static void main(String[] args) {
		double loanInterest = 9;
		System.out.println(loanInterest);

		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHolderName = "john";
		bankAccount.accountNumber = "23446";
		bankAccount.balance = 2000f;
		System.out.println(bankAccount.balance);

	}

}

/*
 - non static members stored in heap memory when we create a new obj. -local
 - variable - variable defined within a method or block -static variable are
 - stored in the method area -local variable are stored in stack -once the
 - method of block finishes that stack area is gone and variable too. -lifecycle
 - of a static variable -lifetime of a class - for nonstatic as long as obj
 */