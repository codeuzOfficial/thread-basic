package codeuz.lesson_6;

public class MyThread extends Thread {

    public Display display;

    public MyThread(Display display) {
        this.display = display;
    }

    @Override
    public void run() {
        this.display.show();
    }
}
