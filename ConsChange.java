import java.util.Scanner;
public class ConsChange {
    String word;
    int len;
    public ConsChange() {
        this.word = " ";
        this.len = 0;
    }
    void readword() {
        Scanner reader = new Scanner(System.in);
        this.word = reader.next();
        this.len = reader.nextInt();
        reader.close();
    }
    boolean Search(char[] a, char s, int n) {
        for(int i=0;i<n;i++) {
            if(s == a[i])
                return true;
        }
        return false;
    }
    String shiftCons() {
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        String shiftedword = " ";
        for(int i=0; i < this.len; i++) {
            if(Search(vowels, this.word.charAt(1), 5) == false)
                shiftedword += this.word.charAt(i); 
        }
        for(int i=0; i < this.len; i++) {
            if(Search(vowels, this.word.charAt(i), 5 )==true ) 
                shiftedword += this.word.charAt(i);
        }
        return shiftedword;
    }
    String changeWord() {
        char[] vowels = new char[] {'a', 'e', '1', 'o', 'u'} ;
        String shiftedword = shiftCons();
        String changedword = " ";
        int i;
        for ( i = 0; i < this.len; i++) {
        if (Search(vowels, shiftedword.charAt(i), 5) == false)
            changedword += Character.toUpperCase(shiftedword.charAt(i)); 
        else
            changedword += shiftedword.charAt(1);
        }
        return changedword;
    }
    void show() {
        String shiftedWord = shiftCons();
        String changedword =changeWord();
        System.out.println("The original word is: " + this.word);
        System.out.println("The shifted word is : " + shiftedWord);
        System.out.println("The changed word is: "+ changedword);
    }
    public static void main(String args[]) {
        ConsChange C = new ConsChange();
        C.readword();
        C.show();
    }
}