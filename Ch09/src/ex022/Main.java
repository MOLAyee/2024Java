package ex022;

public class Main {

    public static void main(String[] args) {
        new Button().SetOnClickListener(new Button.OnClickListener()
        {
            public void OnClick() {
                System.out.println(("Make a phone call!!"));
            }
        }).Touch();
        //callButton.Touch();

        //Button messageButton = new Button();
        new Button().SetOnClickListener(new Button.OnClickListener()
        {
            public void OnClick() {
                System.out.println("Send a message!!");
            }
        }).Touch();
        //messageButton.Touch();

    }
}