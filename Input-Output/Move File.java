package InputOutput;
import java.nio.file.*;

class MoveFile
{
    public static void main(String args[])
    {
        try
        {
            //Original file path
            Path source = Paths.get("D:\\PROGRAMMING\\Java (Advanced)\\Input-Output\\test.txt");
            //New file path
            Path destination = Paths.get("D:\\PROGRAMMING\\Java (Advanced)\\test.txt");

            if (Files.exists(source)) {
                Files.move(source, destination);
                System.out.println("File moved!");
            }
            else {
                System.out.println("No such file present!");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}