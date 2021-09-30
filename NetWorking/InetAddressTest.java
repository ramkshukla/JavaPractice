// Demonstrate Sockets
import java.net.*;
import java.io.*;

class InetAddressTest{
    public static void main(String[] args)throws UnknownHostException {
        int c;

        // Create a socket connected to internic.net port 43.
        Socket s = new Socket("whois.internic.net", 43);

        // Obtain input and output streams
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // Construct a request string.
        String str = (args.length == 0 ? "OraclePressBooks.com" : args[0] + "\n");

        // Convert to Bytes.
        byte buf[] = str.getBytes();

        // send request
        out.write(buf);

        // Read and Display response.
        while ((c = in.read()) != -1){
            System.out.println((char) c);
        }
        s.close();

    }
}