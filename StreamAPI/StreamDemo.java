import java.util.*;
import java.util.stream.*;

class StreamDemo{
    public static void main(String[] args) {
        //Create a list of integer values
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original List: " + myList);

        //Obtain a Stream to the Array list
        Stream<Integer> myStream = myList.stream();

        // Obtain the minimum and maximum value by use of the min(), max(), isPresent() and get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()){
            System.out.println("Minimum values: " + minVal.get());
        }

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()){
            System.out.println("Maximum values: " + maxVal.get());
        }

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Sorted Stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n)->(n%2) == 1);
        System.out.println("Sorted Odd Values: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().sorted().filter((n) -> (n%2) == 1).filter((n) -> n>5);
        System.out.println("Sorted Odd Values greater than five: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}