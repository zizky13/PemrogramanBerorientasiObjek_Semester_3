package LatihanPertemuan11;

import javax.swing.*;
import java.awt.*;

public class CobaGUI_1 extends JFrame {
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");
    CobaGUI_1(){
        setTitle("PROGRAM GUI PERTAMAKU");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.green);
        cb1.setBackground(Color.magenta);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }

    public static void main(String[] args) {
        CobaGUI_1 ZZ = new CobaGUI_1();
        ZZ.objek();
    }
}
