public class p2 {
    public static void main(String[] args) {
        /*System.out.println("");
        Scanner s = new Scanner(System.in);
        int temp = s.nextInt();*/
        int[][] myNumbers = { {10, 18, 3, 14}, {5, 6, 17} };
        int maxnum = 0;
        int[] temp = {1,2};
        for(int i=0; i<myNumbers.length; i++){
            for(int j=0; j<myNumbers[i].length; j++){
                int testnum = myNumbers[i][j];
                if(testnum>maxnum){
                    maxnum = testnum;
                    temp[0] = i;
                    temp[1] = j;
                }

            }
        }
        System.out.println("The maximum number is: " + maxnum);
        System.out.println("The maximum number is located at index: (" + temp[0] +", " + temp[1] + ")");

        //s.close();
    }
}
