import java.util.Scanner; // library used for input and output streams (Java equivalent to #include iostream) shown in video
import java.io.File;
import java.io.FileNotFoundException;

//for java you have to do a scanner input

//4 spaces "    "
public class Tester 
{
    public static void main(String[] args) throws FileNotFoundException //Scanner wouldn't work without
    {
        LinkedList list1  = new LinkedList();
        LinkedList list2 = new LinkedList();

        //because java is so object base there are object libraries for reading in files rather than the file stream commands of c++
        //seems you actually have to call the file class to use files?
        File file = new File("Founding Father Birth Years.txt"); 
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine())
        {
            String textLine = scanner.nextLine();
            list1.addHead(textLine);
            list2.addTail(textLine);
        }
        scanner.close();
            
        System.out.println( "\n" + "Keep your head held high");
        System.out.println("\n" + list1.toList());      //cout is so much less to type
        System.out.println("===========================================");
        System.out.println("\n" +"Bottoms Up");
        System.out.println("\n" + list2.toList());
    }
}
