import java.util.Scanner;

public class bai4 {


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

    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int Find(int[] a, int n, int X) {
        int b =  a[0];
        for (int i=1;i<n;i++){
            if(checkSNT(a[i])){
                if(Math.abs(a[i]-X) < Math.abs(b-X) || Math.abs(a[i]-X) > Math.abs(b-X)){
                    b = a[i];
                }
            }
        }
        return b;
    }

    public  static  int FindIndex(int[] a,int n,int temp){
        for (int i = 0;i<n;i++){
            if (a[i] == temp && a[i]>1){
                return i;
            }
        }return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int X;
        do{
            System.out.print("\nNhap vao so phan tu cua mang: ");
            n= sc.nextInt();
        }while (n<0);
        int[] a = new int[n];
        inputArray(a,n);
        outputArray(a,n);
        do{
            System.out.print("\nNhap vao gia tri cua X: ");
            X=sc.nextInt();
        }while (X<0);
        int find = Find(a,n,X);
        int index = FindIndex(a,n,find);

        System.out.print("\nVi tri so nguyen to tren a co gia tri gan nhat voi x la: " + index);
        sc.close();

    }
}
