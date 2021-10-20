import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many values would you like to enter for addition: ");
        int i = 0, x= 0, temp = s.nextInt();
        while (i < temp) {
            i++;
            System.out.println("Please enter number " + i + ":");
            x += s.nextInt();
        }
        System.out.println("The result of adding all those numbers is: " + x);
        s.close();
    }
}