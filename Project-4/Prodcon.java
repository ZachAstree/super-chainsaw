public class Prodcon {
    public static void main(String[] args) {

        int buffer[] = new int[7];
        Runnable Producer = new Runnable() {

            public void run() {
                try {
                    synchronized (buffer) {
                        for (int i = 0; i < buffer.length; i++) {
                            if (buffer[i] == 0) {
                                buffer[i] = (int)(Math.random() * 101);
                                System.out.println("Producer produced " + buffer[i] + " at index " + i);
                                buffer.notify();
                            }
                        }
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable Consumer = new Runnable() {
            public void run() {
                try {
                    synchronized (buffer) {
                        for (int i = 0; i < buffer.length; i++) {
                            if (buffer[i] != 0) {
                                System.out.println("Consumer consumed " + buffer[i] + " at index " + i);
                                buffer[i] = 0;
                                buffer.notify();
                            }
                        }
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(Producer).start();
        new Thread(Consumer).start();
    }
}
