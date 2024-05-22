import java.util.Scanner;
public class Transarray {
    int arr[][];
    int m, n;
    public Transarray(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    public void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of matrix " + m + " x " + n + " order :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public Transarray transpose() {
        Transarray transposed = new Transarray(n, m);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed.arr[j][i] = this.arr[i][j];
            }
        }
        return transposed;
    }

    public void disparray() {
        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dispTranspose(Transarray transposed) {
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < transposed.m; i++) {
            for (int j = 0; j < transposed.n; j++) {
                System.out.print(transposed.arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Transarray matrix = new Transarray(3, 3);
        matrix.fillarray();
        matrix.disparray();
        Transarray transposedMatrix = matrix.transpose();
        matrix.dispTranspose(transposedMatrix);
    }
}