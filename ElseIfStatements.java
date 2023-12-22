import java.util.*;

public class ElseIfStatements {
    public static void main(String[] args) {
        // int age = 15;

        // if(age >= 18) {
        //     System.out.println("Adult");
        // }
        // else if(age >13 && age < 18) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Not Adult");
        // }

        // Income Tax
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;
         
        // if(income < 500000) {
        //     tax = 0;
        // }
        // else if(income > 500000 && income < 1000000 ) {
        //     tax = (int) (income * 0.2);
        // }
        // else {
        //     tax = (int) (income * 0.3);
        // }
        //     System.out.println("Your Tax is : " + tax);

        // Print Largest Three Numbers
            int A = 1, B = 3, C = 6;

            if ( (A >= B) && (A <= C) ) {
                System.out.println("Largest Number is A");
            }
            else if ( B >= C ) {
                System.out.println("Largest Number is B");
            }
            else {
                System.out.println("Largest Number is C");
            }
     }
}
