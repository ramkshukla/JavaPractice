import java.util.*;
import java.util.stream.*;

class StreamDemo8{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");


        Stream<String> myStream = myList.stream();
        Iterator<String> itr = myStream.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}