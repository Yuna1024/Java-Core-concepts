import java.util.Scanner;

public class bai8 {

    public  static  void inputArr(int[][] A,int m,int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("["+i+"]["+j+"]: ");
                A[i][j]= sc.nextInt();
            }
        }
    }

    public static  void outputArr(int[][] A,int m,int n){
        for (int i =0 ;i<m;i++){
            for (int j=0;j<n;j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }

    public static  void multiplyMatrix(int[][] A,int[][] B,int m,int n,int k){
        int[][] C = new int[m][k];
        for (int i=0;i<m;i++){
            for (int j=0;j<k;j++){
                C[i][j]=0;
                for (int q=0;q<n;q++){
                    C[i][j]=A[i][q]*B[q][j];
                }
            }
        }
        outputArr(C,m,k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,k;
        do {
            System.out.print("Nhap vao so phan tu m: ");
            m= sc.nextInt();
        }while (m<0);
        do {
            System.out.print("Nhap vao so phan tu n: ");
            n= sc.nextInt();
        }while (n<0);

        int[][] A = new int[m][n];
        inputArr(A,m,n);
        System.out.print("\nMa tran so nguyen A cap m*n: \n");
        outputArr(A,m,n);

        do {
            System.out.print("\nNhap vao so phan tu k: ");
            k= sc.nextInt();
        }while (k<0);

        int[][] B = new int[n][k];
        inputArr(B,n,k);
        System.out.print("\nMa tran so nguyen B cap n*k: \n");
        outputArr(B,n,k);
        System.out.print("\nTich cua 2 ma tran so nguyen A B la: ");
        multiplyMatrix(A,B,m,n,k);
        sc.close();
    }
}
