public class Deadlock {
    public static void main(String[] args) {
        String str1 = "This thread";
        String str2 = " is not deadlocked";

        System.out.println("Deadlock begins");

        Runnable t1 = new Runnable() {

            public void run() {
                try {
                    synchronized (str1) {
                        Thread.sleep(100);
                        synchronized (str2) {
                            System.out.println("Thread 1:");
                            System.out.println(str1 + str2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable t2 = new Runnable() {

            public void run() {
                try {
                    synchronized (str1) {
                        Thread.sleep(100);
                        synchronized (str2) {
                            System.out.println("Thread 2:");
                            System.out.println(str1 + str2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(t1).start();
        new Thread(t2).start();
        System.out.println("Deadlock ends");
    }
}
