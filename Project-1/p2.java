import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        int i = 0;
        boolean solved = false;
        int randomNum = (int) (Math.random() * 101);
        Scanner s = new Scanner(System.in);
        while (i < 5) {
            System.out.println("Please guess a number from 1 - 100, you have 5 attempts: ");
            int x = s.nextInt();
            

            if (x >= randomNum - 10 && x <= randomNum + 10) {
                System.out.println("Congrats the random int was: " + randomNum);
                solved = true;
                break;
            }

            i++;
            if (i < 5 && solved == false) {
                System.out.println("Sorry that was wrong try again");
            }
        }
        if (solved == false) {
            System.out.println("Sorry you couldn't guess the correct answer: " + randomNum);
        }
    s.close();
    }
}
