import java.util.*;
import java.util.stream.*;

class StreamDemo10{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Spliterator<String> splitr = myStream.spliterator();
        Spliterator<String> splitr2 = splitr.trySplit();

        if (splitr2 != null){
            System.out.println("Output from spliterator2");
            splitr2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\n Output from Spliiterator: ");
        splitr.forEachRemaining((n) -> System.out.println(n));

    }
}