import java.util.Scanner;

public class Week2PS3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        int total_rows = n;
        int spaces = n - 1;
        int row = 1;
        int stars = 1;
        int num = 1;
        while (row <= total_rows) {
            for (int i = 0; i < stars; i++) {
                System.out.print(num + " ");
                if (num == 1) {
                    num = 0;
                } else {
                    num = 1;
                }
            }
            for (int i = 0; i < spaces; i++) {
                System.out.print("  ");
            }
            System.out.println();
            stars++;
            row++;
            spaces--;
        }
    }
}
