import java.util.*;
import java.util.stream.*;

class StreamDemo6{
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<Double>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);
        System.out.println("Original List: " + myList);

        myList.stream().forEach((a) -> System.out.println(a + " "));
        System.out.println();

        IntStream cstrm = myList.stream().mapToInt((a) -> (int)Math.ceil(a));
        System.out.println("The ceiling of the values in myList : ");
        cstrm.forEach((a) -> System.out.println(a + " "));
    }
}