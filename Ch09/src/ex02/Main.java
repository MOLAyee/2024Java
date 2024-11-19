package ex02;

import ex01.Button;
import ex01.CallListener;
import ex01.MessageListener;

public class Main {

    public static void main(String[] args) {
        Button callButton = new Button();
//        CallListener callListener= new CallListener();
//        callButton.SetOnClickListener(callListener);
        callButton.SetOnClickListener(new CallListener());
        callButton.Touch();

        Button messageButton = new Button();
        MessageListener messageListener = new MessageListener();
        messageButton.SetOnClickListener(messageListener);
        messageButton.Touch();

    }
}