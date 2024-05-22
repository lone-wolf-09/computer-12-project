import java.util.Scanner;

public class Encrypt {
    private String wrd;
    private int len;
    private String newwrd;

    // Default constructor to initialize data members with legal initial values
    public Encrypt() {
        wrd = "";
        len = 0;
        newwrd = "";
    }

    // Method to accept a word in UPPER CASE
    public void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word in UPPER CASE: ");
        wrd = sc.next();
        len = wrd.length();
        sc.close();
    }

    // Method to find the frequency of vowels and consonants in the word
    public void freqvowcon() {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            if (isVowel(ch)) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    // Method to check if a character is a vowel
    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    // Method to replace vowels with the next corresponding vowel
    public void nextVowel() {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            if (isVowel(ch)) {
                switch (ch) {
                    case 'A':
                        encrypted.append('E');
                        break;
                    case 'E':
                        encrypted.append('I');
                        break;
                    case 'I':
                        encrypted.append('O');
                        break;
                    case 'O':
                        encrypted.append('U');
                        break;
                    case 'U':
                        encrypted.append('A');
                        break;
                }
            } else {
                encrypted.append(ch);
            }
        }
        newwrd = encrypted.toString();
    }

    // Method to display the original word along with the encrypted word
    public void disp() {
        System.out.println("Original word: " + wrd);
        System.out.println("Encrypted word: " + newwrd);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Encrypt enc = new Encrypt();
        enc.acceptword();
        enc.freqvowcon();
        enc.nextVowel();
        enc.disp();
    }
}