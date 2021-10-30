public class OddEven {
    public static void main(String[] args) {
        int[] temp = {3,44};
        System.out.println(listints(temp));
    }
    

    public static String listints(int[] temp) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : temp) {
            if (i%2 == 0) {
                sb.append("e");
            }
            else {
                sb.append("o");
            }
            sb.append(i);
            sb.append(",");
        }
        return sb.toString();
    }
}
