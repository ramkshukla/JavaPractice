import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class MyFileVisitor extends SimpleFileVisitor<Path>{
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr)
    throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
class DirTreeList{
    public static void main(String[] args) {
        String dirname = "/home/ram/Desktop/test.txt";
        System.out.println("Directory tree starting with " + dirname + ":\n");
        try{
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        }catch (IOException e){
            System.out.println("I/O Error");

        }
    }
}