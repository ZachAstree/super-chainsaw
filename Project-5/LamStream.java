import java.util.*;

public class LamStream {
    public static List<String> Temp(List<String> list) {
        ArrayList<String> newlist = new ArrayList<String>();
        list.forEach((listitem) -> {
            if(listitem.charAt(0)=='a' && listitem.length() == 3){
                newlist.add(listitem);
            }
        });
        return newlist;
    }
    public static void main(String[] args) {
        String[] temp = {"hello", "world", "arm", "java", "is", "awesome", "learning", "is", "fun", "and", "easy", "to", "use","killers"};
        List<String> al = Arrays.asList(temp);

        System.out.println(Temp(al));
    }
}
