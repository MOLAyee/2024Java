package ex03;

import java.awt.Toolkit;

public class WorkerThread extends Thread{
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<5; i++) {
            toolkit.beep();
            System.out.println("TTing");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }

    }
}
