import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class p2 {

    public static void appendFile() {
        Scanner s = new Scanner(System.in);
        File temp = new File("/Users/zacharyastree/Desktop/Smoothstack/notes.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(temp.getName(), true))) {
            System.out.println("Please enter the text you'd like to append to the file:");
            String data = s.nextLine();
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        s.close();
    }

    public static void main(String[] args) {
        appendFile();
    }
}
