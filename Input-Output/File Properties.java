package InputOutput;
import java.nio.file.*;

class FileProperties
{
    public static void main(String args[])
    {
        Path path = Paths.get("D:\\PROGRAMMING\\Java (Advanced)\\Input-Output\\file.docx");

        //Complete path
        System.out.println(path);

        //Parent folder
        System.out.println(path.getParent());

        //Root folder
        System.out.println(path.getRoot());

        //Specific parent folder
        System.out.println(path.getName(1));

        //Sub-path folder
        System.out.println(path.subpath(0, 2));

        //File name
        System.out.println(path.getFileName());

        //File exists
        System.out.println(Files.exists(path));

        //File does not exist
        System.out.println(Files.notExists(path));

        //File system
        System.out.println(path.getFileSystem());

        //Path to String
        System.out.println(path.toString());
    }
}