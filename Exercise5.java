// import java.util.Scanner;

// public class Exercise5 {
//     public static void main(String[] args) {
//         // Ques:1: How many times Hello is printed?
//        /*  for(int i=0; i<5; i++) {6
//             System.out.println("Hello");
//             i+=2;
//         }
//     */
//     // Ques:2: Write a program to find the factorial of any number entered by the user.
//     Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();
//         if(n==0) {
    //             System.out.println(1);
    //         }

//  }
// }


// import java.util.Scanner;

// public class Exercise5 {
//     public static void main(String[] args) {
//         // Ques:1: How many times Hello is printed?
//        /*  for(int i=0; i<5; i++) {
//             System.out.println("Hello");
//             i+=2;
//         }
//     */
//     // Ques:2: Write a program to find the factorial of any number entered by the user.
//     Scanner sc = new Scanner(System.in);
//   int n = sc.nextInt();
//         if(n==0) {
//             System.out.println(1);
//         }

//  }
// }


import java.util.Scanner;

public class Exercise5 {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive call to find factorial
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        scanner.close();

        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

