import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static void plusMinus(int[] arr){
        int neg = 0;
        int pos = 0;
        int zero = 0;
        double size = arr.length;
        for(int x=0; x < size;x++){
            if(arr[x] < 0){
                neg += 1;
            }else if(arr[x] > 0){
                pos += 1;
            }else{
                zero += 1;
            }
        }

        //System.out.println(neg);
        //System.out.println(pos);
        //System.out.println(zero);
        //System.out.println(size);

        double nresult = neg/size;
        double presult = pos/size;
        double zresult = zero/size;

        DecimalFormat df6 = new DecimalFormat("#0.000000");

        System.out.println(df6.format(presult));
        System.out.println(df6.format(nresult));
        System.out.println(df6.format(zresult));


    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int x = 0; x < arr.length; x++){
            arr[x] = scanner.nextInt();
        }

        plusMinus(arr);
        scanner.close();
    }
}
