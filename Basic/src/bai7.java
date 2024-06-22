public class bai7 {
    public static void main(String[] args) {
        System.out.println("So nguyen to co 6 chu so chi co so le la:");
        for (int i = 100000; i <= 999999; i++){
            boolean check = true;
            int temp1 = i;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            while( temp1 > 0){
                int temp2 = temp1 %10;
                if (temp2%2==0){
                    check=false;
                    break;
                }
                temp1 /= 10;
            }
            if (check){
                System.out.print(i+ "\n");
            }
        }
    }
}
