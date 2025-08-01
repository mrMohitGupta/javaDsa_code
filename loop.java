import java.util.*;
public class loop {
    public static void main(String args[]){
        // int counter = 0;
        // while(counter < 100){
        //     System.out.println("Shree radha krishna");
        //     counter++;
        // }
        // int  counter = 1;
        // while( counter <= 10){
        //     System.out.println( counter);
        //      counter++;
        // }
        // Scanner sc = new Scanner(System.in);
        // int range  = sc.nextInt();
        // int counter = 1;
        // while(counter <= range){
        //     System.out.println(counter + " ");
        //     counter++;

        // }
        // System.out.println();
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while( i <= n){
        //     sum+= i;
        //     i++;

        // }
        // System.out.println(" sum is " + sum);
        // for(int line = 1; line<= 4; line++){
        //     System.out.println("****");
        // }\
        // int n = 10899;
        // while ( n > 0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n/10;
            
        // }
        // System.out.println();

        // reverse number
        // int n = 10899;
        // int rev = 0;
        // while(n > 0){
        //     int lastDigit = n%10;
        //     rev = rev * 10 + lastDigit;
        //     n = n/10;
            
        // }
        // System.out.println(rev);

        // prime number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2){
            System.out.println("n is prime");
        }else {
            boolean isPrime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;

            }
        }
        if(isPrime = true ){
            System.out.println("n is Prime number");
        }else{
            System.out.println("n is not Prime number");
        

        }


         }

    }
    
}
