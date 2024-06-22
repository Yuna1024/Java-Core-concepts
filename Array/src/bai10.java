import java.util.Scanner;

public class bai10 {
    public static void inputArr(int[][] A,int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("A["+i+"]["+j+"]:");
                A[i][j]=sc.nextInt();
            }
        }
    }

    public static  void outputArr(int[][] A,int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void mainDiagonal(int[][] A,int n){
        int sum =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j){
                    sum +=A[i][j];
                }
            }
        }
        System.out.print("\nTong cac phan tu tren duong cheo chinh la: " +sum);
    }

    public static void secondDiagonal(int [][] A,int n){
        int sum=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==n-j-1){
                    sum +=A[i][j];
                }
            }
        }
        System.out.print("\nTong cac phan tu tren duong cheo phu la: " +sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap vap so phan tu n: ");
            n= sc.nextInt();
        }while (n<0);
        int[][] A = new int[n][n];
        inputArr(A,n);
        System.out.print("Ma tran vua nhap : \n");
        outputArr(A,n);
        mainDiagonal(A,n);
        secondDiagonal(A,n);
        sc.close();
    }

}
