import java.util.*;

class collection{
    public static void main(String[] args) {
        //List Collections
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Elements in the ArrayList : " + al);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.addAll(al);
        al1.add(6);
        al1.add(7);
        System.out.println("Elements in the new ArrayList : " + al1);
//
//        al1.clear();
//        System.out.println("Element in ArrayList : " + al1);
        System.out.println("ArrayList contain Element : " + al.contains(1));
        System.out.println("ArrayLsit conatins all Element : "  + al.containsAll(al1));
        System.out.println("Object is equal to ArrayList : " + al.equals(al1));
        System.out.println("HashCode of the ArrayList : " + al.hashCode());
        System.out.println("ArrayList isEmpty() : " + al1.isEmpty());

        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

//        System.out.println("Remove element from ArrayList : " + al.remove(4));
//        System.out.println("Element in the ArrayList : " + al);
//        System.out.println("Remove All element from ArrayList : " + al.removeAll(al1));
//        System.out.println("Element in the ArrayList : " + al);
//        System.out.println(al.removeIf(e->e%2==0));
//        System.out.println("Element in the ArrayList  : " + al);
        System.out.println("RetainsAll : " + al1.retainAll(al));
        System.out.println("Element in the ArrayList  : " + al);
        System.out.println("Element in the ArrayList  : " + al1);
        System.out.println("Size of the ArrayList : " + al.size());

        Object[] arr = al.toArray();
        for (Object i : arr)
            System.out.print(i + " ");
        System.out.println();

        al.add(0, 10);
        System.out.println("Insert object into the invoking list at the index passed in index : " + al);
        al.addAll(6, al1);
        System.out.println("Insert object c into the invoking list at the index passed in index : " + al);
        System.out.println("Return the object stored at the specified index within the invoking collection : " + al.get(0));
        System.out.println("Return the indexOf the Object in the ArrayList  : " + al.indexOf(10));
        System.out.println("Return the lastIndexOf the Object in the ArrayList : " + al.lastIndexOf(1));

        ListIterator<Integer> litr = al.listIterator();
        while (litr.hasNext()){
            Integer i = litr.next();
            System.out.print(i + " ");
        }
        System.out.println();

        ListIterator<Integer> liitr = al.listIterator(1);
        while (liitr.hasNext()){
            Integer i = liitr.next();
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Remove element from the ArrayList " + al.remove(1));
        System.out.println("Assign Object to the location specified by index within the invoking list : " + al.set(0, 12));
        System.out.println("Sublist : " + al.subList(1,3


        ));





        //Set Collections//

        //LinkedHashSet Collections
        //------------------------------------------------//
//        LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
//        ls.add(1);
//        ls.add(2);
//        ls.add(3);
//        System.out.println("LinkedHashSet : " + ls);
        //------------------------------------------------//
        //TreeSet Collections
        //------------------------------------------------//
//        TreeSet<Integer> ts = new TreeSet<Integer>();
//        ts.add(1);
//        ts.add(3);
//        ts.add(4);
//        ts.add(2);
//        System.out.println("TreeSet : " + ts);
//        System.out.println("Ceiling of the TreeSet : " + ts.ceiling(6));
//        System.out.println("First Element of the TreeSet "  + ts.first());
//        System.out.println("Last Element of the TreeSet "  + ts.last());
//        System.out.println("Subset of the TreeSet "  + ts.subSet(2,3));
//        System.out.println("HeadSet of the TreeSet " + ts.headSet(2));
//        System.out.println("TailSet of the TreeSet " + ts.tailSet(2));

//        System.out.println("-----Iterator on TreeSet -----");
//        Iterator<Integer> ditr = ts.descendingIterator();
//        while (ditr.hasNext()){
//            Integer i = ditr.next();
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        System.out.println("------NavigableSet on TreeSet");
//        NavigableSet<Integer> nts = ts.descendingSet();
//        System.out.println(nts);
//
//        System.out.println("Floor of the TreeSet " + ts.floor(1));
//
//        NavigableSet<Integer> nhs = ts.headSet(3, false); // if true the object printed till end
//        System.out.println("HeadSet : " + nhs);
//
//        System.out.println("Higher in TreeSet : " + ts.higher(2));
//        System.out.println("Lower in TreeSet : " + ts.lower(2));
//        System.out.println("Pollfirst in TreeSet : " + ts.pollFirst());
//        System.out.println("PollLast in TreeSet : " + ts.pollLast());

//        NavigableSet<Integer> sst = ts.subSet(1, true, 3, true);
//        System.out.println("Subset in TreeSet" + sst);
//        NavigableSet<Integer> lst = ts.tailSet(3,true);
//        System.out.println("TailSet in TreeSet" + lst);


        //------------------------------------------------//
        // Hash Collections
        //-------------------------------------------------//
        //Stores the values except deplicate
//        HashSet<Integer> hs = new HashSet<Integer>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        hs.add(4);
//        hs.add(5);
//        System.out.println("HashSet : " + hs);
//
//        // Store a collection in new HashSet
//        HashSet<Integer> hs1 = new HashSet<Integer>();
//        hs1.addAll(hs);
//        System.out.println("HashSet1 : " + hs1);

//        Clear the Objects
//        hs.clear();
//        System.out.println("HashSet: " + hs);

//        boolean obj = hs1.contains(1);
//        System.out.println(obj);
//
//        boolean obj1 = hs1.containsAll(hs);
//        System.out.println(obj1);
//
//
//        boolean equal_obj = hs1.equals(hs);
//        System.out.println(equal_obj);
//
//        int hash_code = hs1.hashCode();
//        System.out.println(hash_code);
//
//        Iterator<Integer> it = hs1.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        hs1.remove(5);
//        System.out.println(hs1);

//        hs1.removeAll(hs);
//        System.out.println(hs1);


//        hs.retainAll(hs1);
//        System.out.println(hs);

//        hs.removeIf(e -> e>4);
//        System.out.println(hs);
//
//        int size = hs.size();
//        System.out.println("Size of hs : " + size);
//
//        Object[] arr = hs.toArray();
//        for (Object i : arr)
//            System.out.print(i + " ");
//        System.out.println();

        //-------------------------------------------------------//



    }
}