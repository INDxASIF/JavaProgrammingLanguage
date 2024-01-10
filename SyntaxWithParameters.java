import java.util.Scanner;

public class SyntaxWithParameters {
    public static int calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        return sum;     // ctrl + alt + l to format the document k
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);  // arguments or actual parameters
        System.out.println("Sum is : " + sum);
    }
}
