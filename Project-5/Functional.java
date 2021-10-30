import java.util.*;

public class Functional {
    public static void main(String[] args) {
        Integer[] x = {1,22,93};
        List<Integer> al = Arrays.asList(x);
        String[] y = {"ax","bx","cx", "dx", "xa", "xb", "xksxxkdx"};
        List<String> al2 = Arrays.asList(y);
        
        System.out.println(rightDigit(al));
        System.out.println(Doubling(al));
        System.out.println(noX(al2));

    }

    public static List<Integer> rightDigit(List<Integer> al2){
        List<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < al2.size(); i++){
            al.add(al2.get(i) % 10);
        }
        return al;
    }

    public static List<Integer> Doubling(List<Integer> al2){
        List<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < al2.size(); i++){
            al.add(al2.get(i) * 2);
        }
        return al;
    }

    public static List<String> noX(List<String> al2){
        List<String> al = new ArrayList<String>();
        
        for(int i = 0; i < al2.size(); i++){
            if(al2.get(i).contains("x")){
                al.add(al2.get(i).replace("x", ""));
            }
            else{
                al.add(al2.get(i));
            }
        }
        
        return al;
    }
    
}
