import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen a ,b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a * b;
        while (a  != b){
            if(a>b){
                a -= b;
            }else {
                b -= a;
            }
        }
        int ucln = a;
        System.out.print("Uoc chung lon nhat cua a , b la: " + ucln);
        int bcnn = result/ucln;
        System.out.println("\nBoi chung nho nhat cua a,b la : " + bcnn);
    }
}
