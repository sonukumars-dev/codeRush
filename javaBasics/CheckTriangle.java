import java.util.Scanner;

/**
 * You are given the lengths of 3 sides of a valid triangle. You need to print any one of the following outputs depending on the triangle's nature.
 * Print 1, if the triangle is equilateral
 * Print 0, if it's isosceles
 * Print -1, if it's scalene
 * Draw a flowchart for this process.
Note : You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
 */

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Input the sides of the triangle
        System.out.println("Enter the length of side a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the length of side b: ");
        int b = scanner.nextInt();
        System.out.println("Enter the length of side c: ");
        int c = scanner.nextInt();

//        Conditionals for checking
        if(a==b && b==c){
            System.out.println(1);
        } else if (a==b || b==c || c==a) {
            System.out.println(0);
        }else{
            System.out.println(-1);
        }

        scanner.close();
    }
}


