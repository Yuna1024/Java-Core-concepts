import java.util.Scanner;

public class bai9 {

    public static void inputArr(int[][] A,int m,int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("A["+i+"]["+j+"]:");
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static  void outputArr(int[][] A,int m,int n){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.print("\n");
        }
    }




    public static void arrangeArr(int[][] A, int m, int n) {
        int p = m * n;
        for (int i = 0; i < p - 1; i++) {
            for (int j = i + 1; j < p; j++) {
                if (A[i / n][i % n] > A[j / n][j % n]) {
                    hoanVi(A, i / n, i % n, j / n, j % n);
                }
            }
        }
    }
    public static  void hoanVi(int[][] A,int a,int b,int c,int d){
        int temp = A[a][b];
        A[a][b]=A[c][d];
        A[c][d]=temp;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        do {
            System.out.print("Nhap vap so phan tu m: ");
            m= sc.nextInt();
        }while (m<0);
        do {
            System.out.print("Nhap vap so phan tu n: ");
            n= sc.nextInt();
        }while (n<0);
        int[][] A = new int[m][n];
        inputArr(A,m,n);
        System.out.print("Ma tran vua nhap : \n");
        outputArr(A,m,n);


        arrangeArr(A,m,n);
        System.out.println("Ma trận sau khi sắp xếp tăng dần:");
        outputArr(A, m, n);


        sc.close();
    }
}
