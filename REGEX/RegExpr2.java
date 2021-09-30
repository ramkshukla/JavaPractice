import java.util.regex.*;

class RegExpr2{
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 9");
        System.out.println("Looking for Java in Java 9");

        if (mat.find()) System.out.println("subsequnce found");
        else System.out.println("No Match!");
    }
}