import java.awt.*;
import java.util.Scanner;

public class PrimeNumbersV1 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int div = 2;
        boolean isPrime = true;
        while(div <= n/2){
            if (n % div == 0){
//                System.out.println(div + " " + "Composite");
                System.out.println("Composite");
//                isPrime = false;
                return;
            }
            div = div +1;
        }
        System.out.println("Prime");
    }
}
