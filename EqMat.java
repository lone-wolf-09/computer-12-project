import java.util.Scanner;
public class EqMat {
    private int[][] a;
    private int m, n;
    
    public EqMat(int mm, int nn) { 
        this.m = mm ;
        this.n = nn ; 
        a = new int[m] [n]; 
    }
    public void readArray() { 
        Scanner s = new Scanner(System.in); 
        for(int i = 0 ;i < this.m; i++) { 
            for(int j = 0; j < this.n; j ++) { 
                a [i][j] = s.nextInt(); 
            } 
        } 
        s.close();
    } 
    public int[][] getArray() { 
        return this.a;
    }
    public int getM() { 
        return this.m; 
    }
    public int getN() { 
        return this.n;
    }
    public int check(EqMat P, EqMat Q) {
        int[][] p_array = P.getArray();
        int[][] q_array = Q.getArray();
        int p_m = P.getM(), p_n = P.getN();
        int q_m = Q.getM(), q_n = Q.getN();
        if(p_m != q_m) return 0;
        if (p_n !=q_n) return 0;
        for(int i = 0 ;i < p_m; i ++) {
            for(int j = 0; j <p_n; j++) {
                if(p_array[i][j] != q_array[i][j])
                    return 0;
            }
        }
        return 1;
    }
    public void print() {
        for(int i = 0; i < this.m; i++) {
            for(int j = 0 ;j < this.n; j++) {
                System.out.print(this.a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        EqMat P = new EqMat(3, 3);
        EqMat Q = new EqMat(3, 3);
        P.readArray();
        Q.readArray();
        System.out.println(P.check (P, Q));
        P.print();
        Q.print();
    }
}