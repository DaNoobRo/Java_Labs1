package Lab8;

public class Simulator {

    public static void main(String[] args) {

        //build station Cluj-Napoca
        Controler c1 = new Controler("Cluj-Napoca");

        Segment s1 = new Segment(1);
        Segment s2 = new Segment(2);
        Segment s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //build station Bucuresti
        Controler c2 = new Controler("Bucuresti");

        Segment s4 = new Segment(4);
        Segment s5 = new Segment(5);
        Segment s6 = new Segment(6);

        //build station Turda
        Controler c3 = new Controler("Turda");

        Segment s7 = new Segment(7);
        Segment s8 = new Segment(8);
        Segment s9 = new Segment(9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);

        //connect the 3 controllers

        c1.setNeighbourController(c2);
        c1.setNeighbourController(c3);
        c2.setNeighbourController(c1);
        c2.setNeighbourController(c3);
        c3.setNeighbourController(c1);
        c3.setNeighbourController(c2);

        //testing

        Train t1 = new Train("Bucuresti", "IC-001");
        s1.arriveTrain(t1);

        Train t2 = new Train("Cluj-Napoca","R-002");
        s5.arriveTrain(t2);

        Train t3 = new Train("Turda","R-003");
        s7.arriveTrain(t3);


        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();

        System.out.println("\nStart train control\n");

        //execute 3 times controller steps
        for(int i = 0;i<3;i++){
            System.out.println("### Step "+i+" ###");
            c1.controlStep();
            c2.controlStep();
            c3.controlStep();

            System.out.println();

            c1.displayStationState();
            c2.displayStationState();
            c3.displayStationState();
        }
    }
}
