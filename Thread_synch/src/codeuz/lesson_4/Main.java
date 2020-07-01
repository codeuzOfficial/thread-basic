package codeuz.lesson_4;

public class Main {
    public static void main(String[] args) {
        /* Synchronization */
        // data inconsistency problem (ma'lumotlarning nomuvofiqligi muammosi)

        // class level lock (static synchronization method)

        Display d = new Display();
        MyThread myThread1 = new MyThread(d);

        Display f = new Display();
        MyThread myThread2 = new MyThread(f);

        myThread1.start();
        myThread2.start();

    }
}
