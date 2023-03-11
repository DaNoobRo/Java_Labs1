package Lab5;


public class Controller {
    private static Controller contrl;
    private LightSensor lightS;
    private TemperatureSensor tempS;

    private Controller(){
        lightS=new LightSensor();
        tempS=new TemperatureSensor();
    }
    public static Controller getContrl() {
        if (contrl == null) {
            contrl = new Controller();
        }
        return contrl;
    }

    public void control(){
        long start=System.currentTimeMillis();
        while(System.currentTimeMillis()-start<20000){
            if(System.currentTimeMillis()-start>1000){
                System.out.println("Light sensor value");
                System.out.println(lightS.readValue());
                System.out.println("Temp sensor value ");
                System.out.println(tempS.readValue());
            }

        }
    }

    public static void main(String[] args) {
        Controller arduino = Controller.getContrl();
        arduino.control();
    }

}
