package codeuz.lesson_2;

public class Main {
    public static void main(String[] args) {
        /* Synchronization */
        // data inconsistency problem (ma'lumotlarning nomuvofiqligi muammosi)

        // method level lock (synchronization method)

        Display d = new Display();

        MyThread myThread1 = new MyThread(d);
        MyThread myThread2 = new MyThread(d);

        myThread1.start();
        myThread2.start();
    }
}
