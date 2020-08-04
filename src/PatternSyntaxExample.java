import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//Pattern compile(String regex) - This compiles the given regular expression into a pattern. So if a pattern is invalid, it throws an exception and hence we use try catch to handle the exception.
public class PatternSyntaxExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();
        while (testCases -- > 0){
            String pattern = scanner.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException exception){
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}
