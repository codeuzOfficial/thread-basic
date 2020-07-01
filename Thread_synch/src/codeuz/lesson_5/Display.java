package codeuz.lesson_5;

public class Display {


    public void show() {
        try {
            /// 50
          //  System.out.println(Thread.currentThread().getName());

            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Salom ");
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            }


            // 30
        } catch (Exception e) {

        }
    }

}
