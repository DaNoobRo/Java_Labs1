package Lab11.Ex1;

import javax.swing.*;
import java.awt.*;

// the task was to leave only a text box to show temp as given in lab

public class TemperatureApp extends JFrame {
    TemperatureApp(TemperatureTextView tview){
        setLayout(new BorderLayout());

        add(tview,BorderLayout.NORTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Thermometer t = new Thermometer();
        t.start();


        TemperatureTextView tview = new TemperatureTextView();
        TemperatureController tcontroler = new TemperatureController(t,tview);

        new TemperatureApp(tview);
    }
}
