import java.util.*;

public class FailorPass {
    public static void main(String[] args) {
        // Using TernaryOperator
        int marks = 30;
        String Scorecard = marks >= 33 ? "PASS" : "FAIL";
        System.out.println(Scorecard);
    }
}
