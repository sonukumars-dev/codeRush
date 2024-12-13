/**
 * You are given a single non-negative integer, N. You need to find out whether N is a part of the fibonacci sequence.
 * Print "Yes" if it is and "No" if it's not.
 * Draw a flowchart for this process
 Note 1: The first two terms of the fibonacci sequence are 0 and 1.
 Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
 */


import java.util.Scanner;

public class MemberOfFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number to check whether it is a part of Fibonacci Series: ");
        int N = scanner.nextInt();

        int a = 0, b = 1;

        while (a <= N){
            if (a == N){
                System.out.print("Yes");
                return;
            }
            int Next = a + b;
            a = b;
            b = Next;
        }
        System.out.print("No");

    }
}
