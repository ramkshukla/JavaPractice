//class Box{
//    double width;
//    double height;
//    double depth;
//
//    Box(double w, double h, double d){
//        width = w;
//        height = h;
//        depth = d;
//    }
//
//    public String toString(){
//        return "Dimension are " + width + " by " + depth + " by " + height + ".";
//    }
//}

class String_Tutorial{
    public static void main(String[] args) {
        // Construct one string from another
//        char c[] = {'J', 'a', 'v', 'a'};
//        String s1 = new String(c);
//        String s2 = new String(s1);
//
//        System.out.println(s1);
//        System.out.println(s2);

        // Construct string from subset of char Array
//        byte ascii[] = {65,66,67,68,69,70};
//        String s1 = new String(ascii);
//        System.out.println(s1);
//        String s2 = new String(ascii, 2, 3);
//        System.out.println(s2);

        // String length
//        char chars[] = {'a', 'b', 'c'};
//        String s = new String(chars);
//        System.out.println(s.length());

        //String literals
//        char ch[] = {'a', 'b', 'c'};
//        String s = new String(ch);
//        String s1 = "abc";
//        System.out.println("abc".length());

//        Box b =new Box(10, 12, 14);
//        String s = "Box b: " + b;
//        System.out.println(b);
//        System.out.println(s);

        // Char At
//        char ch;
//        ch = "abc".charAt(1);
//        System.out.println(ch);

        // getChars
//        String s = "This is a demo of the getchars method";
//        int start = 10;
//        int end = 14;
//        char buf[] = new char[end - start];
//        s.getChars(start, end, buf, 0);
//        System.out.println(buf);

        //toCharArray()
//        char[] c = s.toCharArray();
//        System.out.println(c[1]);
        // String Comparisons
        // equals vs ==
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));


    }
}