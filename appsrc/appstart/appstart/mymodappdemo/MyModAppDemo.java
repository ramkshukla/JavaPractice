package appstart.mymodappdemo;
import appsupport.supportfuncs.SupportFuncs;
import appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo{
    public static void main(String[] args) {
        if(SupportFuncs.isFactor(2, 10))
            System.out.println("2 is a factor of 10");
        System.out.println("Smallest factor common to both 35 and 105 is " + SimpleMathFuncs.isFactor(35, 105));
        System.out.println("Largest factor common to both 35 and 105 is " + SimpleMathFuncs.isFactor(35, 105));
    }
}