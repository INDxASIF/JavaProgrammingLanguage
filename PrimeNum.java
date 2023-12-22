import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n ==2) {
            System.out.println("2 is Prime");
        }
        boolean isPrime = true;
        // for(int i=2; i<=n-1; i++) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime == true) {
            System.out.println("N is Prime");
        } else {
            System.out.println("N is not Prime");
        }
    }
}
