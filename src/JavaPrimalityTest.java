import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create 3 BigInteger objects
        BigInteger bi1, bi2, bi3;

        // create 3 Boolean objects
        Boolean b1, b2, b3;

        // assign values to bi1, bi2
        bi1 = new BigInteger("7");
        bi2 = new BigInteger("9");
        bi3 = new BigInteger("10");

        // perform isProbablePrime on bi1, bi2
        b1 = bi1.isProbablePrime(1);
        b2 = bi2.isProbablePrime(1);
        b3 = bi2.isProbablePrime(-1);

        String str1 = bi1+ " is prime with certainity 1 is " +b1;
        String str2 = bi2+ " is prime with certainity 1 is " +b2;
        String str3 = bi2+ " is prime with certainity -1 is " +b3;

        // print b1, b2, b3 values
        System.out.println( str1 );
        System.out.println( str2 );
        System.out.println( str3 );

        //The higher the parameter value, the higher chance that the method will return the correct boolean. the number can be any integer value (including negative values and 0, but both of those return false everytime). 1, 5, and 100 are just common values to put into the parameter, 100 being the most accurate and slowest, 1 being the least accurate and fastest.
        String  n = scanner.nextLine();
        BigInteger number = new BigInteger(n);
        if(number.isProbablePrime(1)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();


    }
}
