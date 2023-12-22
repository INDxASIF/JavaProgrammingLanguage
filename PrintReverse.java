public class PrintReverse {
    public static void main(String[] args) {
       /*  int n = 14102000;

        while (n > 0) { 
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n/= 10;
                    }
        System.out.println(); */
        int n = 25125;
        int rev = 0;

        while (n > 0) { 
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n/=10;
            
        }
        System.out.println(rev);
    }
}
