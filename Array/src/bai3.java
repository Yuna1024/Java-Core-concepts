import java.util.Scanner;

public class bai3 {
    public static void inputArray(int[] a, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
    }

    public static void ouputArray(int[] a, int n){
        System.out.print("Phan tu cua mang la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public  static  void countArray(int a[],int n){
        int[] number = new int[n];
        boolean[] counted= new boolean[n];
        for(int i=0;i<n;i++){
            number[i]=0;
            counted[i]=false;
        }
        for(int i=0;i<n;i++){
            if(counted[i]) continue;
            int count =1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    counted[j]=true;
                }
            }
            number[i]=count;
        }
        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                System.out.println("Phan tu " + a[i] + " xuat hien " + number[i] + " lan.");
            }
        }
        int maxCount = number[0];
        int maxElement = a[0];
        for (int i = 1; i < n; i++) {
            if (number[i] > maxCount) {
                maxCount = number[i];
                maxElement = a[i];
            }
        }

        System.out.println("Phan tu co so lan xuat hien nhieu nhat la: " + maxElement + " (" + maxCount + " lan)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap vao so phan tu cua mang (n>0): ");
            n = sc.nextInt();
        }while (n < 0);
        int[] a = new int[n];
        inputArray(a,n);
        System.out.print("Phan tu cua mang la: ");
        ouputArray(a,n);
        countArray(a,n);
        sc.close();
    }

}
