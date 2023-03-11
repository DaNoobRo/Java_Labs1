package Lab10.Ex3;

public class TestCounters {

   static volatile int i=0;

    public static void main(String[] args) {

        Counter_0_100 c1 = new Counter_0_100();
        Counter_100_200 c2 = new Counter_100_200();

        Thread t1 = new Thread(c1,"conuter1");
        Thread t2 = new Thread(c2,"conuter2");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i is : " +i);
    }
}
