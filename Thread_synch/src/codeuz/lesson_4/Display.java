package codeuz.lesson_4;

public class Display {


    public static synchronized void show() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Salom ");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (Exception e) {

        }
    }

    public synchronized void test() {
        //dasdasd  dsad
    }


    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.print("D Salom: ");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
