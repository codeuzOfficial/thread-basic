package codeuz.lesson_6;

public class Display {


    public void show() {
        try {
            /// 50
            //
             //   Test test = new Test();
            synchronized (Test.class) {
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
