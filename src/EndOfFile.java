import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] rugrats) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int userNumber = 1;
        while (scanner.hasNext()){
            System.out.println(userNumber++ + " " + scanner.nextLine());
        }

    }
}