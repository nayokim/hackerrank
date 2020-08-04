import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokenizerExample {


    public static void main(String[] args) {
        String str = "This is String , split by StringTokenizer, created by mkyong";

        StringTokenizer st1 = new StringTokenizer(str);
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st2 = new StringTokenizer(s, "A-Z !, ?._'@");
        System.out.println(st2.countTokens());
        while(st2.hasMoreTokens())
            System.out.println(st2.nextToken());

    }



}
