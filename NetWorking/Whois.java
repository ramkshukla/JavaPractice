// Demonstrate Sockets
import java.net.*;
import java.io.*;

class Whois{
    public static void main(String[] args)throws Exception {
       int c;
       try(Socket s = new Socket("whois.internic.net", 43)){
           InputStream in = s.getInputStream();
           OutputStream out = s.getOutputStream();

           String st = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
           byte buf[] = st.getBytes();

           out.write(buf);

           while ((c = in.read()) != -1){
               System.out.print((char) c);
           }

       }
    }
}