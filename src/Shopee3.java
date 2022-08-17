import java.util.Scanner;

public class Shopee3 {
	 public static void main(String[] args) { 

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter number of usernames :  ");
		int c = input.nextInt();
		int numtrans = 0;
		
		System.out.print("Please enter number of transactions :  ");
		numtrans  = input.nextInt();
		
		int[] newbalance = new int[c];
		String usernames[] = new String[c];
		int balance[] = new int[c];
		
		System.out.print("Please enter usernames and balance:  ");
		 for(int i = 0; i < usernames.length; i++ ) {
		        usernames[i] = input.next();
		        balance[i] = input.nextInt();
		 }
		

			for(int i = 0; i < numtrans; i++ ) {
			System.out.print("Please enter user 1 ");
			String user1 =  input.next();
			System.out.print("Please enter user 2 ");
			String user2 =  input.next();
			
			System.out.print("How much do you want to transfer : ");
			int numtransfer  = input.nextInt();
			
			
		
			for(int j = 0; j < usernames.length; j++ ) {
			if(user1.equalsIgnoreCase(usernames[j])) {
				if(balance[j] > numtransfer) {
					balance[j] = balance[j] - numtransfer;
					
					 for(int l = 0; l < usernames.length;l++ ) {
							if(user2.equalsIgnoreCase(usernames[l])) {
								
									balance[l] = balance[l] + numtransfer;							
						
							}
							}
				} 
			}else
				newbalance[j] = balance[j];
			}
			
			 
					

			}
			for(int k = 0; k < usernames.length; k++) {
				 System.out.println(usernames[k] + " " +balance[k]);
			 }
			

		 }
	 }