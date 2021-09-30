import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class DirLis1{
    public static void main(String[] args) {
        String dirname = "/home";
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>(){
            public boolean accept(Path filename)throws IOException{
                if (Files.isWritable(filename)) return true;
                return false;
            }
        };

        try(DirectoryStream<Path> dirs = Files.newDirectoryStream(Paths.get(dirname), how)){
            System.out.println("Directory of " + dirname);
            for (Path entry: dirs){
                BasicFileAttributes attr = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attr.isDirectory())
                    System.out.print("<Dirs>");
                else
                    System.out.print("        ");
                System.out.println(entry.getName(1));
            }
        }catch(InvalidPathException e){
            System.out.println("Path Error " + e);
        }catch (NotDirectoryException e){
            System.out.println(dirname + " is not a directory");
        }catch (IOException e){
            System.out.println("I/O Exception " + e);
        }
    }
}