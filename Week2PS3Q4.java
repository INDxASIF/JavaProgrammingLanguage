import java.util.Scanner;
public class Week2PS3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = sc.nextInt();
        int total_rows = n;
        int spaces = n-1;
        int stars = 1;
        int row = 1;
        int num = 1;
        while(row <= total_rows){
            //print star
            for(int i = 0; i < stars; i++){
                System.out.print(num+" ");
                num++;
            }
            //print spaces
            for(int i = 0; i < spaces; i++){
                System.out.print("  ");
            }
            //go to next line
            System.out.println();
            row++;
            spaces--;
            stars++;
        }
    }
}
