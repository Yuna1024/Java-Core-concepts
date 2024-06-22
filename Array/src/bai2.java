import java.util.Scanner;

public class bai2 {

    public static void inputArray(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
    }

    public static void ouputArray(int a[],int n){
        System.out.print("Phan tu cua mang la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static  void sortArray(int a[],int n){
        for(int i  = 0; i<n ; i++){
            for (int j = 0; j< n-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap vao so phan tu cua mang (n>0): ");
            n = sc.nextInt();
        }while (n < 0);
        int a[] = new int[n];
        inputArray(a,n);
        System.out.print("Phan tu cua mang la: ");
        ouputArray(a,n);
        System.out.print("Sap xep theo mang tang dan la: \n");
        sortArray(a,n);
        sc.close();
    }
}
