import java.util.Scanner;
public class BinSearch {
    int arr[];
    int n;
    BinSearch(int nn) {
        n = nn;
    }
    void fillarray() {
        Scanner x = new Scanner(System.in);
        arr=new int[n];
        System.out.println("Enter "+n + " elements");   
        for(int i= 0; i < n ; i++){
        arr[i]=x.nextInt();}
        x.close();
    }
    void sort() {
        int t;
        for(int i=0;i<n-1;i++)
        for(int j=0;j<n-1-i;j++) {
            if (arr[j]>arr[j+1]) {
                t = arr[j] ;
                arr[j]=arr[j+1]; 
                arr[j+1]=t;
            }
        }
    }
    int bin_search(int l, int u, int v) {
        int m = (l + u) / 2;
        if(arr[m] == v)
            return m;
        else if(l>u)
            return -1;
        else if (arr[m] > v)
            return bin_search (l, m-1, v);
        else
            return bin_search (m + 1, u, v);
    }
    public static void main() {
        BinSearch obj = new BinSearch(7);
        obj.fillarray();
        obj.sort();
        System.out.println(" location: " + obj.bin_search (0, 4, 20));
    }
}