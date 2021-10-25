import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class p3 {

    public static String runBuffStream_Resource() {
        String absPath = "/Users/zacharyastree/Desktop/Smoothstack/notes.txt";
        int count = 0;
        int temp1;
        String temp = "";
        String ret = "The file does not exist sorry";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter character you would like to find: ");

        String newtemp = s.nextLine();
        char userin = newtemp.charAt(0);
        s.close();

        try (BufferedReader bufRead = new BufferedReader(new FileReader(absPath))) {
            while ((temp1 = bufRead.read()) != -1) {
                temp = temp + (char) temp1;
            }
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == userin) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(temp != ""){
                ret = userin + " appears " + count + " times in the file whose contents are: \n" + temp;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(runBuffStream_Resource());
    }
}