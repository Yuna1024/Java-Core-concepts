import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Tich cac thua so nguyen to cua "+n+" la:");
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                System.out.print(i);
                n /= i;
                if(n > 1){
                    System.out.print(" x ");
                }
            }
        }
        if(n > 1){
            System.out.print(n);
        }
    }
}
