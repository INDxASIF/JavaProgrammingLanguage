import java.util.*;

public class SwitchStatements {
    public static void main(String[] args) {
        // int number = 3;
        // switch (number) {
        //     case 1:
        //         System.out.println("M416");

        //         break;
        //     case 2:
        //         System.out.println("AKM");
        //         break;
        //     case 3:
        //         System.out.println("DBS");   // break is used to break after the right execution of the element;
        //         break;
        //     default:
        //         System.out.println("LOBBY");
        //         break;
        // }
        char ch ='b';
        switch (ch) {
            case 'a':
                System.out.println("M416");

                break;
            case 'b':
                System.out.println("AKM");
                break;
            case 'c':
                System.out.println("DBS");   // break is used to break after the right execution of the element;
                break;
            default:
                System.out.println("LOBBY");
                break;
        }
    }
}
