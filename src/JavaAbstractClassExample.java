//public class interface DogInterface{
//    //list of variables and methods. No
//    void bark();
//    void poop();
//    // we dont need to put abstract here. It assumes that its abstract (non-implement). Its just a list
//}

abstract class Dog{
    public void bark(){
        System.out.println("Bark!");
    }
    //abstract method - means its unimplemented
    public abstract void poop();

    //abstract classes help us organize what a class should have. It can have a list of methods and ones that are implemented.

}
//chihuhua is an extension of Dog
//comes with breed and bark
//need to implement abstract method
//extending  (extending whats already there) means adding to previously implemented methods

class Chihuahua extends Dog{
    public void poop(){
        System.out.println("Dog pooped");
    }
}

public class JavaAbstractClassExample {
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();
    }
}


