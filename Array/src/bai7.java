import java.util.Scanner;

public class bai7 {

    public static  void InputArray(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }
    }

    public static void OutputArray(int[] a,int n){
        System.out.print("\nMang vua nhap: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap vao so luong ptu: ");
            n = sc.nextInt();
        }while (n<0);
        int[] a =new int[n];
        InputArray(a,n);
        OutputArray(a,n);
    }
}
