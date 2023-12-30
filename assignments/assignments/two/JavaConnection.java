package week3.assignments.two;

public class JavaConnection  implements DatabaseConnection{

	@Override public void connect() {
		System.out.println("Connect");
		
	}

	@Override public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override public void executeUpdate() {
		System.out.println("ExecuteUpdate");
		
	}

}
