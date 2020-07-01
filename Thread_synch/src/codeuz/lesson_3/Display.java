package codeuz.lesson_3;

public class Display {

    public String id;


    public Display(String id) {
        this.id = id;
    }

    public synchronized void show() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Salom " + id +" : ");
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
