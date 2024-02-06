public class CallByValue {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        // swap - value exchange
        int a = 5;
        int b = 10;
/*
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
*/
        swap(a, b);
    }
}
