
class Cat{
    void getName(){
        System.out.println("willa cat");
    }

}
public class InstanceOfExampleI {
    public static void main(String[] args) {
        InstanceOfExampleI s1 = new InstanceOfExampleI();
        Cat cat = new Cat();
        System.out.println(s1 instanceof  InstanceOfExampleI); // true
        System.out.println(cat instanceof Cat);// true
    }

}
