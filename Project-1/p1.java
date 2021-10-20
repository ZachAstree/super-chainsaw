import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of times you want the pattern to repeat itself: ");
        int x = s.nextInt();
        s.close();
        String temp = "*";
        String newtemp = "";

        System.out.println("1)");
        for (int i = 0; i < x; i++) {
            System.out.println(temp);
            temp = temp.concat("*");
        }

        System.out.println("2)");
        for (int i = 0; i < x; i++) {
            int num = x - i;
            System.out.println(temp.substring(0, num));
        }

        System.out.println("3)");
        temp = "*";

        for (int i = 0; i < x; i++) {
            int track = x - i;
            newtemp = "";
            for (int k = 0; k < track; k++) {
                newtemp = newtemp.concat(" ");
            }
            System.out.println(newtemp + temp);
            temp = temp.concat("**");
        }

        System.out.println("4)");
        for (int i = 0; i < x; i++) {
            int track = (x - i) * 2 - 1;
            newtemp = "";
            for (int j = 0; j < i; j++) {
                newtemp = newtemp.concat(" ");
            }
            System.out.println(newtemp + temp.substring(0, track));

            temp = temp.concat("");
        }

    }
}
