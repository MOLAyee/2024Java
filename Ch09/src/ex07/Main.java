package ex07;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

//        m.TestTV(new RemoteController() {
//            @Override
//            public void TurnOn() {
//                System.out.println("Turn On Test");
//            }
//
//            @Override
//            public void TurnOff() {
//                System.out.println("Turn Off Test");
//            }
//        });
        RemoteController rc = new TV();
        m.TestTV(rc);
    }

    void TestTV(RemoteController rc) {
        rc.TurnOn();
        rc.TurnOff();
    }
}
