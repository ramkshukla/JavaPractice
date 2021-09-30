import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class NIO
{
    public static void main(String[] args) {
        Path filepath = Paths.get("/home/ram/Desktop/test.txt");
        System.out.println("File Name: " + filepath.getName(3));
        System.out.println("Path: " + filepath);
        System.out.println("Absolute Path: " + filepath.toAbsolutePath());
        System.out.println("Parent: " + filepath.getParent());

        if (Files.exists(filepath))
            System.out.println("File Exists.");
        else
            System.out.println("File does not exists.");

        try{
            if (Files.isHidden(filepath))
                System.out.println("File is Hidden.");
            else
                System.out.println("File is not Hidden.");

        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }

        Files.isWritable(filepath);
        System.out.println("File is Writable");

        Files.isReadable(filepath);
        System.out.println("File is Readable");

        try{
            BasicFileAttributes attr = Files.readAttributes(filepath, BasicFileAttributes.class);
            if (attr.isDirectory())
                System.out.println("The File is Directory");
            else
                System.out.println("The File is not Directory");
            if (attr.isRegularFile())
                System.out.println("The file is normal file");
            else
                System.out.println("The file is not a normal file");
            if (attr.isSymbolicLink())
                System.out.println("The file is Symbolic Link");
            else
                System.out.println("The file is not Symbolic link");
            System.out.println("File Last Modifeid: " + attr.lastModifiedTime());
            System.out.println("File Size: " + attr.size() + " Bytes");
        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}