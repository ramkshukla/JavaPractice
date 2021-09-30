import java.util.*;
import java.util.stream.*;

class StreamDemo4{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original List: " + myList);
        Stream<Double> sqrtRootStrm = myList.stream().map((a) -> Math.sqrt(a));
        double productOfSqrtRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a*b);
        System.out.println("Product of the square roots is " + productOfSqrtRoots);
    }
}