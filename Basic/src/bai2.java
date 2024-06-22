import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Uoc cua so nguyen n:  ");
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("\nSo luong uoc cua n la : " + count);
    }
}
