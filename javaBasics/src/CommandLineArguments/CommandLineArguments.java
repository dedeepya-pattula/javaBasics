package CommandLineArguments;

public class CommandLineArguments {

	public static void main(String[] args) {

		int length = args.length;
		if(length ==0) {
			System.out.println("no input provided");
		}
		else {
			System.out.println("list of arguments");
			for(int i = 0;i<length;i++) {
				System.out.println(args[i]);
			}
		}
		
	}

}
