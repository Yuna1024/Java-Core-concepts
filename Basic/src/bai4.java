import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen a ,b: ");
        Scanner sc = new Scanner(System.in);
        int a,b;
        do {
            System.out.print("\nNhap vao so nguyen a: ");
            a = sc.nextInt();
            if (a< 0){
                System.out.print("So ban nhap khong thoa man yeu cau a > 0 vui long nhap lai!");
            }
        }while (a<0);
        do{
            System.out.print("\nNhap vao so nguyen b(b > a): ");
            b = sc.nextInt();
            if (b <= a){
                System.out.print("\nSo b ban nhap khong thoa man dieu kien vui long nhap lai !");
            }
        }while (b <= a);
        System.out.println("So nguyen to trong doan " + a + " den " + b + " la: ");
        for(int i = a; i <= b; i++) {
            boolean check = i > 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
    }
}
