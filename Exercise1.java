import java.util.*;
public class Exercise1 {

    public static void main(String[] args) {
// Question 1
        /* In a Program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers. */
 // Question 2
        /* In a Program, input the side of a square. You have to output the area of the square. */
// Question 3
        /* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. (You can also try adding 18% gst to the items in the bill as an advanced problem) */
//   Solution 1
       /*  Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);*/
// Solution 2
        /*Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("area of the square is : " + area);*/
// Solution 3
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float price = pencil + pen + eraser;
        System.out.println("price without gst is: " + price);
// With GST%
        float total = price + (0.1f * price);
        System.out.println("Total with GST is :" + total);
           }
}