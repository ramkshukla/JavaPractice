import java.util.regex.*;
class RegExpr9{
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ ,.!]");
        String str[] = pat.split("one two,alpha 12!done.");
        for (int i=0; i< str.length; i++)
            System.out.println("Next Token: " + str[i]);
    }
}