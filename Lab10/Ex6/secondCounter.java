package Lab10.Ex6;

public class secondCounter extends Thread{

    Chronos time=null;

    public secondCounter(Chronos time) {
        this.time = time;
    }
    public void run(){
        while (currentThread().isAlive()){
            synchronized (time){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time.sec++;
            }
        }

    }
}
