import java.util.Scanner;

public class bai5 {

    public static void inputArray (int[] a, int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void outputArray(int[] a, int n){
        System.out.print("Mang vua nhap:  ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.print(" ");
    }

    public static  void insertArray(int[] a, int n, int[] b, int m, int p){
        int[] newArray = new int[n+m];
        for (int i =0 ;i<p;i++){
            newArray[i] =a[i];
        }
        for (int i =0; i <m;i++){
            newArray[p+i] = b[i];
        }
        for (int i=p ; i < n;i++){
            newArray[m+i] = a[i];
        }
        outputArray(newArray,newArray.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        do{
            System.out.print("\nNhap vao so phan tu cua mang a[]: ");
            n= sc.nextInt();
        }while (n<0);
        int[] a = new int[n];
        inputArray(a,n);
        outputArray(a,n);
        do {
            System.out.print("\nNhap vao so phan tu cua mang b[]: ");
            m= sc.nextInt();
        }while (m<0);
        int[] b = new int[m];
        inputArray(b,m);
        outputArray(b,m);
        int p;
        System.out.print("\nNhap vao so p: ");
        do {
            p= sc.nextInt();
        }while (p<0 || p> n);
        System.out.print("Mang sau khi chen la: ");
        insertArray(a,n,b,m,p);
        sc.close();
    }
}
