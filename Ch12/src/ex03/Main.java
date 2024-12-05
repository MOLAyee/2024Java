package ex03;

public class Main {

    public static void main(String[] args) {
        Thread workThread = new WorkerThread();
        workThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("DDoing");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
