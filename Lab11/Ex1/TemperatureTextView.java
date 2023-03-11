package Lab11.Ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class TemperatureTextView extends JPanel implements Observer {

    //variable declaration

    JTextField jtfTemp;
    JLabel jtlTemp;
    JButton action;

    TemperatureTextView(){
        this.setLayout(new FlowLayout());
        jtfTemp = new JTextField(20);
        jtlTemp = new JLabel("Temperature");
        action = new JButton("Enable-Disable");
        add(action);add(jtlTemp);add(jtfTemp);
    }

    public void update(Observable o, Object arg) {
        String s = ""+((Thermometer)o).getTemperature();
        jtfTemp.setText(s);
    }

    public void addEnableDisableListener(TemperatureController.EnableDisableListener listener) {
        action.addActionListener(listener);
    }

}
