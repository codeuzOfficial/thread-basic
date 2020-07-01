package codeuz.lesson_5;

public class Main {
    public static void main(String[] args) {
        /* Synchronization */


        // synchronization block (method,object,class)


        Display d = new Display();
        MyThread myThread1 = new MyThread(d);

//        Display f = new Display();
        MyThread myThread2 = new MyThread(d);

        myThread1.start();
        myThread2.start();

    }
}
