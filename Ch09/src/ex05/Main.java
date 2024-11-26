package ex05;

public class Main {

    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
//        anony.tv.TurnOn();
//        anony.tv.TurnOff();

//        anony.TVControl();

        anony.TVTurnOnAndTurnOff(new RemoteController() {
                                     @Override
                                     public void TurnOn() {
                                         System.out.println(("Turn on TV."));
                                     }

                                     @Override
                                     public void TurnOff() {
                                         System.out.println(("Turn off TV."));
                                     }
                                 }
        );
    }
}
