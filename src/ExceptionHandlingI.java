import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingI {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException f){
            System.out.println(f);
        }

        //another way

//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println(scanner.nextInt()/scanner.nextInt());
//        } catch (ArithmeticException | InputMismatchException ex) {
//            System.out.println(ex);
//        }
    }
}
