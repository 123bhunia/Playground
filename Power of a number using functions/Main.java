import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
       int base=in.nextInt();
    int exponent=in.nextInt();

        long result = 1;

        for (;exponent != 0; --exponent)
        {
            result *= base;
        }

        System.out.println( result);
    }
}
 


