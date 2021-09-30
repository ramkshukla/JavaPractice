import java.io.*;
class PrintfDemo{
    public static void main(String[] args) {
        System.out.println("Here are some numeric values in different formats");
        System.out.printf("Various Integer Formats: ");
        System.out.printf("%d %(d %+d %05d\n)", 3, -3, 3, 3);
        System.out.println();
        System.out.printf("Default floating point format: %f\n", 1234567.123);
        System.out.printf("Floating point with commas : %,f\n", 1234567.123 );
        System.out.printf("Negative floating point default: %,f\n", -1234567.123);
        System.out.printf("Negative floating point option: %,(f\n", -1234567.123);
    }
}