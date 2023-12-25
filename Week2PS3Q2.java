import java.util.Scanner;
public class Week2PS3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
                int total_rows = n;
        int spaces = n-1;
        int stars = 1;
        int row = 1;
        while(row <= total_rows) {
            //first print spaces
            for(int i = 0; i<spaces; i++) {
                System.out.print("  ");
            }
            //print stars
            for(int i = 0; i<stars; i++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            spaces--;
            stars++;
        }
    }
}
