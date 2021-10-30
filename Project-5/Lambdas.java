import java.time.chrono.IsoChronology;

public class Lambdas {
    public static void main(String[] args) {
        System.out.println(isOdd(4));
        System.out.println(isPrime(5));
        System.out.println(isPalindrome(898));
        System.out.println(isOdd(3));
        System.out.println(isPrime(12));
    }

    public static String isOdd(int x){
        return (x % 2 == 0) ? "EVEN" : "ODD";
    }

    public static String isPrime(int x){
        return(x == 2 || x == 3 || x == 5 || x == 7) ? "PRIME" :(x % 2 == 0) ? "COMPOSITE" : (x % 3 == 0) ? "COMPOSITE" : (x % 5 == 0) ? "COMPOSITE" : (x % 7 == 0) ? "COMPOSITE" : "PRIME";
    }

    public static String isPalindrome(int x){
        return (x == Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString())) ? "PALINDROME" : "NOT PALINDROME";
    }
}