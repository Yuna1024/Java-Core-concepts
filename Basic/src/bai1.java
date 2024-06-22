import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        //Y a
        System.out.println("Nhap vao so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        double sum2 = 0;
        if(n%2==0){
            for(int i=2;i<=n;i+=2){
                sum += i;
            }
            System.out.println(sum);
        }else {
            for(int i=1;i<=n;i+=2){
                sum += i;
            }
            System.out.println(sum);
        }
        //Y b
        for(int i=1;i<=n;i++){
            double result =  (double) 1 /i;
            sum2 += result;
        }
        System.out.println(sum2);
    }
}
