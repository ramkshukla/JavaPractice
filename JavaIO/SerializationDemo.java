import java.io.*;

public class SerializationDemo{
    public static void main(String[] args) {
        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("serial"))){
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("Object1: " + object1);
            ob.writeObject(object1);
        }catch(IOException e){
            System.out.println("Exception during serialization: " + e);
        }

        try(ObjectInputStream ob = new ObjectInputStream(new FileInputStream("serial"))){
            MyClass object2 = (MyClass) ob.readObject();
            System.out.println("Object2: " + object2);
        }catch(Exception e){
            System.out.println("Exception during deserialization: " + e);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d){
        this.s = s;
        this.i = i;
        this.d = d;
    }
    public String toString(){
        return "s=" + s + "; i=" + i  + "; d=" + d;
    }
}
