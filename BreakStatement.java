import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
       /*  for(int i=1; i<=5; i++) {
            if(i ==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out the loop"); */
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Your Number");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
        
    }
}
