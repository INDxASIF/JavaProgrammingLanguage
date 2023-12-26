import java.util.Scanner;
public class Week2PS3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n = sc.nextInt();
        int row = 1;
        int stars = n;
        int spaces = n-2;
        while (row <= n-1){
            if(row == 1 || row == n-1){  //ya first row ho ya last row ho
                // print n stars
                for(int i = 0; i < stars; i++) {
                    System.out.print("* ");
                }
            }
            else{
                //print 1 star
                System.out.print("* ");

                //print n-2 spaces
                for(int i = 0; i < n-2; i++){
                    System.out.print("  ");
                }
                //print 1 star
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
    }
}
