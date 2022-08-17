package Package_Study;
public class MySampleException extends Exception {
	
	public static void main(String[] args) {
		try {
			System.out.println("before system.exit");
			System.exit(0);
			System.out.println("After system.exit");
		}finally {
			System.out.println("in block D");
		}
		System.out.println("out of the system");
	}
}

