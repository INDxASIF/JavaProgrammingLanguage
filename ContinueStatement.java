import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
       /*  for(int i=1; i<=5; i++){
            if(i == 2) {
                continue;
            }
            System.out.println(i);
        } */
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Your Number");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                continue;
            }
            System.out.println("Number is :" + n);
        } while(true);
    }
}
