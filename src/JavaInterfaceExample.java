//interface is an outline for a class
interface waterBottleInterface{
    String color  ="blue";

    void fillUp();

    void pourOut();
}

//we wanted to create a waterbootle but we  didnt know how. So we used the interface to implement everything from the interface
public class JavaInterfaceExample implements waterBottleInterface {
    public static void main(String[] args) {
        System.out.println(color);
        JavaInterfaceExample ex = new JavaInterfaceExample();
        ex.fillUp();
        ex.pourOut();

    }

    @Override
    public void fillUp() {
        System.out.println("it is filled");
    }

    @Override
    public void pourOut() {
        System.out.println("it has been poured out");
    }
}
