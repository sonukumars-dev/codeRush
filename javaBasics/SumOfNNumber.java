import java.util.Scanner;

public class SumOfNNumber {
    public static void main(String[] args) {
        int N=0;
        System.out.println("Enter a positive number");
        Scanner s= new Scanner(System.in);
        N = s.nextInt();

        int i = 1;
        int sum = 0;

        while(i<=N){
            sum = sum +i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
