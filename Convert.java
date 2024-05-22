import java.util.Scanner;
public class Convert{
    int n,d,m,y;
    Convert() {
        n = 0;
        y = 0;
    }
    void accept() {
        Scanner x =new Scanner(System.in);
        System.out.println("Enter day number and year");
        n=x.nextInt();
        y=x.nextInt();
        x.close();
    }
    void day_to_date() {
        int a[] ={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0)
            a[2]=29;
        int s=0,c=0;
        while(s < n)
            s=s+a[c++];
        s=s-a[--c];
        d=n-s;
        m=c;
    }
    void display() {
        String x[]={"", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY",
        "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        System.out.print("\n Day Number: " + n);
        System.out.print("\n Date: ");
        System.out.print( x[m] +" "+d+","+","+y);
    }
    public static void main(String[] args){
        Convert obj= new Convert();
        obj.accept();
        obj.day_to_date();
        obj.display();
    }
}