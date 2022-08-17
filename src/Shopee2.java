import java.util.Scanner;

public class Shopee2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbe of rod ");
        int n = input.nextInt();
        int[] Rod = new int[n];
        
        System.out.print("Enter height of rod ");
        for(int i = 0; i<Rod.length; i++) {
        	 Rod[i] = input.nextInt();
        }
       
        
        
        
        int sum = 0;
        
        for(int i = 0; i<Rod.length; i++) {
        	sum = sum +Rod[i];
        }
        
        int height = sum/2;
        
        if(height%2 == 0) {
        	System.out.println("Maximum height is " + height);
        }else {
        	
            int max = 0;
            sum = 0;
            
            for(int i = 0; i<Rod.length; i++) {
            	if(Rod[i] > max) {
            		max = Rod[i];
            	}    	
            }
            
            for(int i = 0; i<Rod.length; i++) {
            	if (max != Rod[i]) {
            		sum = sum + Rod[i];
            	}
            }
            
            
          
            if(sum == max) {
            	System.out.println(max);
            }else {
            	max = 0;
            	System.out.println(max);
            }
        	}        
        

        input.close();
	}

}
