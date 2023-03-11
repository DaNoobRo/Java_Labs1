package Lab9.Ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Simulator extends JFrame {

    JButton buttonadd;
    JLabel ciumbrud,bucuresti,cluj;
    JLabel seg1, seg2, seg3; //Label Ciumbrud
    JLabel seg4, seg5, seg6; //Label Cluj
    JLabel seg7, seg8, seg9; //Label Bucuresti


    static JTextField textseg1,textseg2,textseg3; //TxtField Ciumbrud
    static JTextField textseg4, textseg5, textseg6; //TxtField Cluj
    static JTextField textseg7, textseg8, textseg9; //TxtField Bucuresti

    JLabel id, segment, station, text4add; //Label Add Train
    JTextField id1, segment1, station2; //TxtField Add train


    Simulator(){

        setTitle("Railway Traffic Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(1000, 1000);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 20;


        ciumbrud= new JLabel("CLuj-Napoca");
        ciumbrud.setBounds(150, 0, 400, height);
        seg1 = new JLabel("Segment 1");
        seg1.setBounds(0,20,150,height);
        seg2 = new JLabel("Segment 2");
        seg2.setBounds(0,40,150,height);
        seg3 = new JLabel("Segment 3");
        seg3.setBounds(0,60,150,height);
        textseg1 = new JTextField();
        textseg1.setBounds(100, 20, 150, height);
        textseg2 = new JTextField();
        textseg2.setBounds(100, 40, 150, height);
        textseg3 = new JTextField();
        textseg3.setBounds(100, 60, 150, height);

        cluj= new JLabel("Bucuresti");
        cluj.setBounds(450, 0, 400, height);
        seg4 = new JLabel("Segment 4");
        seg4.setBounds(300,20,150,height);
        seg5 = new JLabel("Segment 5");
        seg5.setBounds(300,40,150,height);
        seg6 = new JLabel("Segment 6");
        seg6.setBounds(300,60,150,height);
        textseg4 = new JTextField();
        textseg4.setBounds(400, 20, 150, height);
        textseg5 = new JTextField();
        textseg5.setBounds(400, 40, 150, height);
        textseg6 = new JTextField();
        textseg6.setBounds(400, 60, 150, height);

        bucuresti= new JLabel("Ciumbrud");
        bucuresti.setBounds(750, 0, 400, height);
        seg7 = new JLabel("Segment 7");
        seg7.setBounds(600,20,150,height);
        seg8 = new JLabel("Segment 8");
        seg8.setBounds(600,40,150,height);
        seg9 = new JLabel("Segment 9");
        seg9.setBounds(600,60,150,height);
        textseg7 = new JTextField();
        textseg7.setBounds(700, 20, 150, height);
        textseg8 = new JTextField();
        textseg8.setBounds(700, 40, 150, height);
        textseg9 = new JTextField();
        textseg9.setBounds(700, 60, 150, height);

        id= new JLabel("ID");
        id.setBounds(700, 500, 500, height);
        segment= new JLabel("Segment");
        segment.setBounds(700, 520, 400, height);
        station= new JLabel("Station");
        station.setBounds(700, 540, 400, height);

        text4add= new JLabel("ADD A NEW TRAIN");
        text4add.setBounds(825, 480, 150, height);
        id1 = new JTextField();
        id1.setBounds(800, 500, 150, height);
        segment1 = new JTextField();
        segment1.setBounds(800, 520, 150, height);
        station2 = new JTextField();
        station2.setBounds(800, 540, 150, height);
        buttonadd = new JButton("Add New Train");
        buttonadd.setBounds(800, 560, 150, height);
        buttonadd.addActionListener(new AddNewTrain());


        add(cluj);add(bucuresti);add(ciumbrud);
        add(seg1);add(seg2);add(seg3);
        add(seg4);add(seg5);add(seg6);
        add(seg7);add(seg8);add(seg9);
        add(textseg1);add(textseg2);add(textseg3);
        add(textseg4);add(textseg5);add(textseg6);
        add(textseg7);add(textseg8);add(textseg9);
        add(id); add(segment); add(station);
        add(id1); add(segment1); add(station2);
        add(buttonadd); add(text4add);
    }

    public static void main(String[] args) {

        new Simulator();



        //build station Cluj-Napoca
        Controller c1 = new Controller("Cluj-Napoca");

        Segment s1 = new Segment(1);
        Segment s2 = new Segment(2);
        Segment s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);


        //build station Bucuresti
        Controller c2 = new Controller("Bucuresti");

        Segment s4 = new Segment(4);
        Segment s5 = new Segment(5);
        Segment s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);

        //build station Ciumbrud
        Controller c3 = new Controller("Ciumbrud");

        Segment s7 = new Segment(7);
        Segment s8 = new Segment(8);
        Segment s9 = new Segment(9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);


        //connect the 3 controllers

        c1.setNeighbourController(c2);
        c2.setNeighbourController(c1);
        c1.setNeighbourController(c3);
        c3.setNeighbourController(c1);
        c2.setNeighbourController(c3);
        c3.setNeighbourController(c2);


        //testing

        Train t1 = new Train("Bucuresti", "IC-001");
        s1.arriveTrain(t1);

        Train t2 = new Train("Cluj-Napoca","R-002");
        s6.arriveTrain(t2);

        Train t3= new Train("Ciumbrud","IC-005");
        s5.arriveTrain(t3);

        Train t4= new Train("Cluj-Napoca","R-202");
        s4.arriveTrain(t4);

        Train t5= new Train("Cluj-Napoca","R-301");
        s7.arriveTrain(t5);


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




        try {
            Simulator.textseg1.setText(s1.TrainName());
        }catch(Exception e1){}

        try {

        }catch(Exception e1){}
        Simulator.textseg2.setText(s2.TrainName());
        try {

        }catch(Exception e1){}

        try {
            Simulator.textseg3.setText(s3.TrainName());
        }catch(Exception e1){}

        try {
            Simulator.textseg4.setText(s4.TrainName());
        }catch(Exception e1){}

        try {
            Simulator.textseg5.setText(s5.TrainName());
        }catch(Exception e1){}

        try {
            Simulator.textseg6.setText(s6.TrainName());
        }catch(Exception e1){}

        try {
            Simulator.textseg7.setText(s7.TrainName());
        }catch(Exception e1){}

        try {
            Simulator.textseg8.setText(s8.TrainName());
        }catch(Exception e1){}

        try {
            Simulator.textseg9.setText(s9.TrainName());
        }catch(Exception e1){}


    }

    class AddNewTrain implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            String destination,name;

            name=Simulator.this.id1.getText();
            destination=Simulator.this.station2.getText();
            Segment h = new Segment(Integer.parseInt(Simulator.this.segment1.getText()));

            Train t = new Train (destination,name);
            h.arriveTrain(t);

            switch (Integer.parseInt(Simulator.this.segment1.getText())) {
                case 1: Simulator.textseg1.setText(h.TrainName());break;
                case 2: Simulator.textseg2.setText(h.TrainName());break;
                case 3: Simulator.textseg3.setText(h.TrainName());break;
                case 4: Simulator.textseg4.setText(h.TrainName());break;
                case 5: Simulator.textseg5.setText(h.TrainName());break;
                case 6: Simulator.textseg6.setText(h.TrainName());break;
                case 7: Simulator.textseg7.setText(h.TrainName());break;
                case 8: Simulator.textseg8.setText(h.TrainName());break;
                case 9: Simulator.textseg9.setText(h.TrainName());break;

            }

        }
    }
}
