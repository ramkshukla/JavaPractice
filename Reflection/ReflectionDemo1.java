import java.lang.reflect.*;

class ReflectionDemo1{
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("java.io.BufferedReader");
            System.out.println("Construction:");
            Constructor<?> constructors[] = c.getConstructors();

            for (int i=0; i<constructors.length; i++)
                System.out.println(" " + constructors[i]);

            System.out.println("Fields:");

            Field fields[] = c.getFields();
            for (int i=0; i<fields.length; i++)
                System.out.println(" " + fields[i]);

            Method method[] = c.getMethods();
            for (int i=0; i< method.length; i++)
                System.out.println(" " + method[i]);
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}