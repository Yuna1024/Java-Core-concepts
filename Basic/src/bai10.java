public class bai10 {
    public static  boolean checkSNT(int n){
        if (n<2){
            return false;
        }
        else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public static  boolean checkALLSNT(int n){
        while (n > 0){
            int a = n%10;
            if(a != 2 && a !=3 && a!=5 && a!=7){
                return false;
            }
            n /= 10;
        }
        return true ;
    }

    public static  boolean check(int n){
        int a = n;
        int b =0;
        while (n>0){
            b = b*10 + n%10;
            n = n/10;
        }
        return a == b;
    }

    public static void main(String[] args) {
        System.out.print("Cac so thoa man dieu kien la: \n");
        for (int i = 1000000; i <=9999999 ; i++){
            if(checkSNT(i) && checkALLSNT(i)){
                if (check(i)){
                    System.out.print(i+ "\n");
                }
            }
        }
    }
}
