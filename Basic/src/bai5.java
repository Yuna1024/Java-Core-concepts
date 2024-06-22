import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int n;
        int sum =0;
        System.out.println("Nhap vao so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int temp= Math.abs(n);
        while (temp > 0) {
            sum += temp%10;
            temp/=10;
        }
        System.out.println("Tong so "+n+" la: " + sum);
    }
}
