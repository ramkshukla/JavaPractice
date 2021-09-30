import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class DirList{
    public static void main(String[] args) {
        String dirname = "/home";
        try(DirectoryStream<Path> dirs = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Directory of " + dirname);
            for (Path entry : dirs) {
                BasicFileAttributes attr = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attr.isDirectory())
                    System.out.print("<Dirs> ");
                else
                    System.out.print("        ");
                System.out.println(entry.getName(1));
            }
        }catch(InvalidPathException e) {
            System.out.println("Invalid Path Error " + e);
        }
        catch (NotDirectoryException e) {
            System.out.println(dirname + "is not a Directory");
        }
        catch (IOException e){
            System.out.println("I/O Error " + e);
        }
    }
}