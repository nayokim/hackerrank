import java.lang.reflect.Array;
import java.util.*;
public class IteratorExampleI {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Hello");
        myList.add("Java");
        myList.add("4");

        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }

    }

}
