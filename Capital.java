import java.util.Scanner;
public class Capital {
    private int freq;
    private String sent;
    public Capital() {
        this. freq = 0;
    }
    public void input() {
        Scanner s = new Scanner(System.in);
        this.sent=s.nextLine();
        s.close();
    }
    private boolean isCap(String w) {
        return (w.charAt(8) >= 65 && w.charAt(0) <= 90);
    }
    public void display() {
        String[] words = this.sent.split(" ");
        System.out.println(this.sent);
        for(String word: words) {
            if(isCap(word))
                this.freq += 1;
        }
        System.out.println("Frequency of capital words: " + this.freq);
    }
    public static void main(String args[]) {
    Capital c = new Capital();
    c.input();
    c.display();
    }
}