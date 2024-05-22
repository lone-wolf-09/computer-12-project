import java.util.Scanner;
public class Shift {
    public int mat[][];
    int m;
    int n;
    // Constructor to initialize matrix dimensions and allocate space
    public Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }
    // Method to input matrix elements
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements for " + m + " x " + n + " matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    // Method to perform cyclic shift of the matrix
    public void cyclic(Shift P) {
        // Shift all rows up by one position
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                P.mat[i - 1][j] = mat[i][j];
            }
        }
        // Move the first row to the last row
        for (int j = 0; j < n; j++) {
            P.mat[m - 1][j] = mat[0][j];
        }
    }
    // Method to display the matrix
    public void display() {
        System.out.println("The final matrix after shifting:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Shift originalMatrix = new Shift(4, 4);
        originalMatrix.input();
        Shift shiftedMatrix = new Shift(4, 4);
        originalMatrix.cyclic(shiftedMatrix);
        shiftedMatrix.display();
    }
}