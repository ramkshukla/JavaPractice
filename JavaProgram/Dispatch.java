class A{
    void callme(){
        System.out.println("Inside A's callme method");
    }
}

class B extends A{
    void callme(){
        System.out.println("Inside B's callme method");
    }
}

class C extends A{
    void callme(){
        System.out.println("Inside C's callme method");
    }
}

class Dispatch{
    public static void main(String[] args) {
        A a = new A(); // Object of type A
        B b = new B(); // Object of type B
        C c = new C(); // Object of type C

        A r; // obtain a reference of type A

        r = a; // r refers to an A object
        r.callme(); // call A's version of callme

        r = b; // r refers to an B object
        r.callme(); // call B's version of callme

        r = c; //r refers to an C object
        r.callme(); // call C's version of callme






    }
}