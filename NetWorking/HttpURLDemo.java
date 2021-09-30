import java.net.*;
import java.io.*;
import java.util.*;

class HttpURLDemo{
    public static void main(String[] args) throws  Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpcon = (HttpURLConnection) hp.openConnection();

        // Display request  Method
        System.out.println("Request method is " + hpcon.getRequestMethod());

        // Display Response Code
        System.out.println("Response Code is " + hpcon.getResponseCode());

        //Display Response Message
        System.out.println("Response Message is " + hpcon.getResponseMessage());

        // Get the list of Header fields and the set
        // of the header keys

        Map<String, List<String>> hdrMap = hpcon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header");

        // Display all header keys and values
        for (String key : hdrField){
            System.out.println("Keys: " + key + " Value: " + hdrMap.get(key));
        }
    }
}