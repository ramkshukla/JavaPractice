import java.util.regex.*;
class RegExpr{
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();
        System.out.println("Testing Java against Java");

        if (found) System.out.println("Match!");
        else System.out.println("No Match!");

        System.out.println();

        System.out.println("Testing Java against Java9");
        mat = pat.matcher("Java9");
        found = mat.matches();
        if (found) System.out.println("Match!");
        else System.out.println("No Match!");
    }
}