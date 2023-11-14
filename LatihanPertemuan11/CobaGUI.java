package LatihanPertemuan11;

import javax.swing.*;
import java.awt.*;

public class CobaGUI extends JFrame {
    Checkbox cb1 = new Checkbox("Pilih A");
    Checkbox cb2 = new Checkbox("Pilih B");
    Checkbox cb3 = new Checkbox("Pilih C");
    CobaGUI(){
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek (){
        getContentPane();
    }
}
