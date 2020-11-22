package controller;

public class MoveMessage implements Message {
    int keyCode;

    public MoveMessage(int keyCode) {
        this.keyCode = keyCode;
    }
}
