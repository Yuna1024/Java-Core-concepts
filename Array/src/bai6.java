import java.util.Scanner;

public class bai6 {

    public static void inputArray(int[] a, int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
    }

    public static void outputArray(int[] a, int n){
        System.out.print("\nMang vua nhap la: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.print(" ");
    }

    public static  void sortArray(int[] a, int n){
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

    public static void insertArray(int[] a, int n, int x){
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = a[i];
        }
        for (int i = n; i < n+1; i++) {
            newArray[n] =  x;
        }
        sortArray(newArray,newArray.length);
        outputArray(newArray,newArray.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so phan tu cua mang : ");
            n = sc.nextInt();
        }while (n<0);
        int[] a = new int[n];
        inputArray(a,n);
        outputArray(a,n);
        System.out.print("\nSap xep theo mang tang dan la: \n");
        sortArray(a,n);
        int x;
        System.out.print("Nhap vao so phan tu x: ");
        x = sc.nextInt();
        System.out.println("Sap xep mang a theo thu tu tang dan la:");
        insertArray(a,n,x);
        sc.close();
    }
}
