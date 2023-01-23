package annoymousinner;

public class DriverManager {
	
	static Connection getConnection() {
	Connection con =new Connection() {

		@Override
		public void createStatement() {

			System.out.println("annoymouse inner classes method");
		}
		
	
	};

	return con;
}
}
