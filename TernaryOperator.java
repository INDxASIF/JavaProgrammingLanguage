import java.util.*;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 6;
        String type = ((number % 2) ==0) ? "even" : "odd";
        System.out.println(type);
    }
}
