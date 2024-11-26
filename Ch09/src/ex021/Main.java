package ex021;

public class Main {

    public static void main(String[] args) {
        Button callButton = new Button();
        callButton.SetOnClickListener(new Button.OnClickListener()
        {
            public void OnClick() {
                System.out.println(("Make a phone call!!"));
            }
        });
        callButton.Touch();

        Button messageButton = new Button();
        messageButton.SetOnClickListener(new Button.OnClickListener()
        {
            public void OnClick() {
                System.out.println("Send a message!!");
            }
        });
        messageButton.Touch();

    }
}
