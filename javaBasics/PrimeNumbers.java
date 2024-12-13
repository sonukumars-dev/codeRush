import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Input the number to get prime numbers
        System.out.print("Enter a positive number: ");
        int N = scanner.nextInt();

//        print all prime numbers
        System.out.println("Prime numbers from 1 to "+ N +":");
        for(int i =2; i <= N; i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
        }
    }

//    Method to check whether a number is prime
public static boolean isPrime(int num){
        if (num <= 1)   return false;

        for (int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
   }
}
