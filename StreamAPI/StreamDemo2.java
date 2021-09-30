import java.util.*;
import java.util.stream.*;

class StreamDemo2{
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Original List: " + myList);

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a*b);
        if (productObj.isPresent()){
            System.out.println("Product as Optional: " + productObj.get());
        }

        int product = myList.stream().reduce(1, (a, b) -> a*b);
        System.out.println("Product a int: " + product);
    }
}