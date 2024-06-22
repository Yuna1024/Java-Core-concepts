public class bai8 {

    public static  boolean Check(int n){
        int a = n;
        int b =0;
        while (n>0){
            b = b*10 + n%10;
            n = n/10;
        }
        return a == b;
    }
    public static void main(String[] args) {
        //Y A
        System.out.print("\nY A: ");
        for (int i = 100000; i <= 999999; i++){
            if (Check(i)){
                System.out.print(i + "\n");
            }
        }
        //Y B
        System.out.print("\nY B: ");
        for (int i = 100000; i <= 999999; i++){
            if (Check(i)){
                int sum = 0;
                int temp = Math.abs(i);
                while (temp > 0){
                    sum += temp%10;
                    temp /=100;
                }
                if(sum==10){
                    System.out.print(i + "\n");
                }
            }
        }
    }
}
