import java.util.Scanner;
public class Week2PS3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        int total_rows = n;
        int stars = n;
        int spaces = 0;
        int row = 1;
        while(row <= total_rows){
            int num = 1;
            for(int i = 0; i < stars; i++){
                System.out.print(num+" ");
                num++;
            }
            for(int i = 0; i<spaces; i++){
                System.out.print("  ");
            }
            System.out.println();
            row++;
            spaces++;
            stars--;
        }
    }
}
