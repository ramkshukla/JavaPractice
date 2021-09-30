import java.io.*;

class DataIODemo{
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);

        }catch(FileNotFoundException e){
            System.out.println("Cannot Open Output file");
        }catch (IOException e){
            System.out.println("I/O Exception " + e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Here are the values: " + d + " " + i + " " + b);
        }catch (FileNotFoundException e){
            System.out.println("Cannot open the Input File.");
            return;
        }catch(IOException e){
            System.out.println("I/O Exception " + e);
        }
    }
}