import java.util.Scanner;
public class Mystring{
    String str;
    public Mystring(){
        str=" ";
    }
    public void readstring(){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a string a string: ");
        str = sc.nextLine();
        sc.close();
    }
    public int code (int index) {
        if(index >=0 && index < str.length())
            return (int) str.charAt(index); 
        else{
        System.out.println("Index out of bound");
        return -1;
        }
    }
    public void word() {
        String [] words = str. split ("// s+");
        String longestword = " ";
        for (String word: words) {
            if (word.length()>longestword.length())
                longestword = word;
        }
        System.out.println("longest word: "+longestword);
    }
    public static void main(String[] args){
        Mystring aa=new Mystring();
        aa.readstring();
        System.out.println("ASCII code of character at index 0"+ aa.code(0));
        aa.word();
    }
}