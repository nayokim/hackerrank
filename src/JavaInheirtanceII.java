public class JavaInheirtanceII {
    //Write the following code in your editor below:
    //
    //A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
    //A class named Adder that inherits from a superclass named Arithmetic.

    class Arithmetic {
        int add(int one, int two){
            return one + two;
        }
    }

    class Adder extends Arithmetic{
        int sum(int one, int two){
            return one + two;
        }
    }
}
