package ex02;

import java.awt.*;

public class BeepTask  implements Runnable{
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
