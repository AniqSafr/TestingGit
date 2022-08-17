import java.util.Scanner;
import java.lang.Math;

public class Shopee1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int test = 1, day, cell = 1,k=0;
        do {
        System.out.print("Please enter number of test cases :  ");
        
        test = input.nextInt();
        if(test < 1 || test > 10) {
            System.out.print("Please enter again :  ");
        }
        } while (test < 1 || test > 10 );
        
        do {
        System.out.print("Please enter number of day :  ");
        do {
        day = input.nextInt();
        if(day < 1 || day > 1000) {
            System.out.print("Please enter again :  ");
        }
        } while (day < 1 || day > 1000 );

        System.out.print("Please enter number of cell :  ");
        do {
        cell = input.nextInt();
        if(cell < 1 || cell > 1000) {
            System.out.print("Please enter again :  ");
        }
        } while (cell < 1 || cell > 1000 );
        
        double[] health = new double[cell];
        

        
        int z = 0;
        double total = 0;
        while (z < day) {
            for(int i = 0; i < health.length; i++) {    
                health[i] = Math.random()*10; // convert int
                health[i] = Math.random()*10; 
                health[i] = (int)health[i]; 
              }        
                  for(int i = 0; i < health.length; i++) {
                    System.out.println(health[i]);
                  }
                
        int movement = 0;
        System.out.print("Please enter according to these number : \n1 = STAY ON THE SPOT \n2 = WALK THROUGH THE PARK AND BACK TO THE INITAL POSITION \n3 = CROSS THE PARK AND REST FOR NEXT DAY    : ");
        movement = input.nextInt();
        if(movement == 1) {
        	total = 0;
        }
        if(movement == 2) {
            System.out.print("Please enter how many cells you want to walk through :  ");
            int numcell = input.nextInt();
            for(int i = 0; i < numcell; i++) {                 
               total = total + health[i];
        }       
        }
        if(movement == 3) {
            System.out.print("Please enter how many cells you want to walk through :  ");
            int numcell = input.nextInt();
            for(int i = 0; i < numcell; i++) { 
               total = total + health[i];
            }   
        }

        z++;       
    }
        System.out.println(total);
        k++;
        }while (k != test );
}
}
