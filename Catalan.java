import java.util.Scanner;
public class Catalan {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter value of n (1..10): ");
    int n =in.nextInt();
    in.close();
    long CatNumber ,a;
    int cnt =1;
    if ( n >= 1 && n <=10 ) {
        //calculate factorials of a and 2a
        for( a = 1 ; a <=n; a++)
        {  long factofa=1, factof2a=1; 
            for(long i=1;i<=a; i++) 
            factofa *= i; 
            for(long i=1; i <=2*a;i++) 
            factof2a *= i ; 

            // now calculate catalan number 
            CatNumber = factof2a /((factofa*factofa) * (a + 1) ) ;    
            System.out.println(" "+ cnt++ +". "+ CatNumber);
        }
    }
}
}
