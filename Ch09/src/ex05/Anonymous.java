package ex05;

public class Anonymous {
    //RemoreController tv = new TV();
    RemoteController tv = new RemoteController() {
        @Override
        public void TurnOn() {

        }

        @Override
        public void TurnOff() {

        }
    };
}
