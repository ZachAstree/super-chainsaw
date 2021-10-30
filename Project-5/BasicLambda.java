import java.util.*;

public class BasicLambda {

    public static void main(String[] args) {
        String[] geeks = {"hello", "world", "java", "is", "awesome", "learning", "is", "fun", "and", "easy", "to", "use","livinglovers"};
        List<String> al = Arrays.asList(geeks);

        al.sort((s1, s2) -> ((String) s1).length() - ((String) s2).length());
        System.out.println(al);

        al.sort((s1, s2) -> ((String) s2).length() - ((String) s1).length());
        System.out.println(al);

        al.sort((s1, s2) -> ((String) s1).charAt(0) - ((String) s2).charAt(0));
        System.out.println(al);

        al.sort((s1, s2) -> ((String) s2).indexOf("e") - ((String) s1).indexOf("e"));
        System.out.println(al);

    }
    
}

