import java.util.Scanner;
public class Test {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number"); 
    int n = in.nextInt(); 
    in.close();
    int primorial = 1 ; 
    boolean IsPrime=false; 
    if(n > 1) {
        System.out.print(n + "#= "); 
        for (int i = 2 ; i <= n ; i++) { 
            IsPrime =true;
            int mid = i / 2 ;
            for (int j=2; j <= mid; j++)
                if (i%j == 0) 
                    IsPrime = false; 
            if (IsPrime == true) { 
                System.out.print(""+i+"x");
                primorial *= i; 
            }
        } 
        System.out.println("_ = "+ primorial);
    }
    else
        System.out.println("Value of n should be more than 1");
}
}

