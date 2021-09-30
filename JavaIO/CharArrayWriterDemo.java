import java.io.*;

class CharArrayWriterDemo{
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should endup in the array";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);
        try {
            f.write(buf);
        }catch (IOException e){
            System.out.println("Error Writing to buffer");
            return;
        }
        System.out.println("Buffer as a String");
        System.out.println(f.toString());
        System.out.println("Into Array");

        char[] c = f.toCharArray();
        for (int i=0; i<c.length; i++){
            System.out.print(c[i]);
        }
        System.out.println("\nTo a FileWriter()");
        try(FileWriter f2 = new FileWriter("test.txt")){
            f.writeTo(f2);
        }catch(IOException e){
            System.out.println("I/O Error: " + e);
        }

        System.out.println("Doing a reset.");
        f.reset();

        for (int i=0; i<3; i++){
            f.write('X');
        }
        System.out.println(f.toString());
    }
}