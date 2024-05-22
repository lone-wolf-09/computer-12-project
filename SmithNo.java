import java.util.Scanner;
public class SmithNo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long num, savNum;
    System.out.print("Enter a number: ");
    num = in.nextLong();
    in.close();
    int digit, sumDigit=0, sumPrime=0, factor, countOfFactors=0 ;
    
    //checking whether it's a prime number or a non-prime
    for (int i=1; i<= num; i++)
        if (num%i==0) 
            countOfFactors++;
    // if it's a non-prime num, count will be > 2
    if (countOfFactors> 2)  {
        // calculate its sum of digits
        savNum=num;
        System.out.print("Sum of digits (");
        while (savNum >0) {
            digit=(int) savNum %10;
            sumDigit += digit;
            savNum/=10;
            System.out.print(digit+",");
        }
        System.out.println("-) is: "+sumDigit);
        //calculate sum of prime factors
        factor = 2;
        long Num2 = num;
        System.out.print("Sum of prime factors (");
        while(factor <= Num2) {
            // if valid prime factor
            if(Num2% factor == 0) {
                System.out.print(factor+",");
                //ie if it is single digit factor
                if (factor < 10) 
                    sumPrime+=factor;
                else{
                    savNum=factor;
                    while (savNum > 0) {
                        digit=(int) savNum %10;
                        sumPrime+=digit; //individual digits added to sumofPrime number
                        savNum/=10;
                    }
                }
                Num2/= factor;
            }
            // else: invalid prime factor
            else {  
                if(factor == 2) 
                    factor = 3; 
                else factor+=2;
            }
        }
        System.out.println("-) is:"+sumPrime); 
        if (sumPrime==sumDigit) 
             System.out.println("IS SMITH NUMBER");
        else
            System.out.println("NOT A SMITH NUMBER");
    }
    else
    System.out.println("It is a Prime number. A prime number can never be a Smith Number.");
}
}

    