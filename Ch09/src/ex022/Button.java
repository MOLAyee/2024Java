package ex022;

public class Button {
    OnClickListener listener;

    public Button SetOnClickListener (Button.OnClickListener listener) {
        this.listener = listener;
        return this;
    }

    public void Touch() {
        if (listener != null)
            listener.OnClick();
    }

    public interface OnClickListener {
        void OnClick();
    }

}