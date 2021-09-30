import java.lang.reflect.*;

class ReflectionDemo2{
    public static void main(String[] args) {
        try{
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("Public Methods: ");
            Method method[] = c.getDeclaredMethods();
            for (int i=0; i < method.length; i++){
                int modifiers = method[i].getModifiers();
                if (Modifier.isPublic(modifiers)){
                    System.out.println(" " + method[i].getName());
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class A{
    public void a1(){}
    public void a2(){}
    protected void a3(){}
    private void a4(){}

}