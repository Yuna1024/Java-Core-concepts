public class bai9 {
    public static  boolean Check(int n){
        int a = n;
        int b =0;
        while (n>0){
            b = b*10 + n%10;
            n = n/10;
        }
        return a == b;
    }

    public static  boolean checkEven(int n){
        while (n > 0){
            int a = n%10;
            if(a != 0 && a !=6 && a!=8){
                return false;
            }
            n /= 10;
        }
        return true ;
    }
    public static boolean checkSum(int n){
        int sum =0;
        while (n > 0) {
            sum += n%10;
            n/=10;
        }
        return sum%10==0;
    }
    public static void main(String[] args) {
        System.out.print("\nSo nguyen to co 7 den 9 chu so thoa man la: ");
        for (int i = 1000000; i <= 999999999; i++) {
            if (Check(i) && checkEven(i) && checkSum(i)) {
                    System.out.print("\n"+ i + "\n");
            }
        }
    }
}
