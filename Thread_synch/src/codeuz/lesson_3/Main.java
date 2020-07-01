package codeuz.lesson_3;

public class Main {
    public static void main(String[] args) {
        /* Synchronization */
        // data inconsistency problem (ma'lumotlarning nomuvofiqligi muammosi)

        // method level lock (synchronization method)

        Display d = new Display("d");
        Display f = new Display("f");

        MyThread myThread1 = new MyThread(d);
        MyThread myThread2 = new MyThread(d);

        MyThread myThread3 = new MyThread(f);


        myThread1.start();
        myThread2.start();

        myThread3.start();

        // synchronization method ishlatilayotgan objectqa bog'langan.
    }
}
