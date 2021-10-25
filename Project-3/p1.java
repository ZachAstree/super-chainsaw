import java.io.File;

public class p1 {

    static void fileExplore(File[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].isFile())
            System.out.println(arr[i].getName());
            
            else if (arr[i].isDirectory()) {
                System.out.println(arr[i].getName());
                fileExplore(arr[i].listFiles());
            }
        }
    }

    public static void main(String[] args) {
        String path = "/Users/zacharyastree/Desktop/Smoothstack";
        File dir = new File(path);
        if (dir.exists()){
            if (dir.isDirectory()) {
                File arr[] = dir.listFiles();
                fileExplore(arr);
            }
        }
    }
}
