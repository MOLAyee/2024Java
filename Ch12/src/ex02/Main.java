package ex02;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

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
