import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {

//        LinkedList<String> animals = new LinkedList<>();
//        animals.add(0,"Dog");
//        animals.add(1,"Cat");
//        animals.add(2,"horse");
//
//        System.out.println("LinkedList: " + animals);
//
//        LinkedList<String> mammals = new LinkedList<>();
//        mammals.add("Doggie");
//        mammals.add("Kitty");
//        mammals.add("Horsey");
//        System.out.println("Mammals: " + mammals);
//
//        animals.addAll(mammals);
//        System.out.println("Animals: " + animals);

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LinkedList<Integer> listOfNumbers = new LinkedList<>();
        for (int i = 0; i < N; i++){
            int number = scanner.nextInt();
            listOfNumbers.add(number);
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++){
            String action= scanner.next();
            if  (action.equals("Insert")){
                int index = scanner.nextInt();
                int number = scanner.nextInt();
                listOfNumbers.add(index,number);
            } else {//delete
                int index = scanner.nextInt();
                listOfNumbers.remove(index);
            }
        }
        scanner.close();

        for  (Integer num : listOfNumbers){
            System.out.print(num + " ");
        }
    }
}
