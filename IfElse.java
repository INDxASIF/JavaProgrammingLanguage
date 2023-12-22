import java.util.*;

public class IfElse {
    public static void main(String[] args) {
    //     int age = 15;
    //   if(age >=18) {
    //     System.out.println("Adult : Vote, Drive");
    //   }
    //   if(age > 13 && age < 18) {
    //     System.out.println("Teenager");
    //   }
    //   else {
    //     System.out.println("Not Adult");
    //   }

    // int A = 15;
    // int B = 20;
    // if (A >= B) {
    //     System.out.println("A is the Largest than B");
    // }
    // else {
    //     System.out.println("B is the Largest than A");
    // }

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
     
    if(number % 2 == 0) {
        System.out.println("EVEN");
    }
    else {
        System.out.println("ODD");
    }
    }
}
