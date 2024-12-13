/**
* You are given a single non-negative integer, N. You need to print all numbers that:
* (i) occur in the range 0 to N (both inclusive)
* (ii) are a part of the fibonacci sequence
* Draw a flowchart for this process
Note 1: The first two terms of the fibonacci sequence are 0 and 1.
Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
*/


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int N = scanner.nextInt();

        System.out.println("Fibonacci numbers in the range 0 to " + N + ":");

        int a = 0, b = 1;

        while (a <= N){
            System.out.print(a+ " ");
            int Next = a + b;
            a = b;
            b = Next;
        }

    }
}
