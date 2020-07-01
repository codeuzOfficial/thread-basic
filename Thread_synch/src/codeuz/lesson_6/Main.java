package codeuz.lesson_6;

public class Main {
    public static void main(String[] args) {
        /* Synchronization */


        // synchronization block (method,object,class)


        Display d = new Display();
        MyThread myThread1 = new MyThread(d);

        Display f = new Display();
        MyThread myThread2 = new MyThread(f);

        myThread1.start();
        myThread2.start();

        /* Synchronization */
        // data inconsistency problem (ma'lumotlarning nomuvofiqligi muammosi)
        // lock
        // Object (method) level lock (synchronization method)
        // class level lock (static synchronization method)
        // synchronization block (method,object,class)



    }
}
