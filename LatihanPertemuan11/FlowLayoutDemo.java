package LatihanPertemuan11;
import java.awt.*;
public class FlowLayoutDemo extends Frame {
    public static void main(String[] args) {
        FlowLayoutDemo fld = new FlowLayoutDemo();
        fld.setLayout(new FlowLayout());
        fld.add(new Button("ONE"));
        fld.add(new Button("TWO"));
        fld.add(new Button("THREE"));
        fld.setSize(100,100);
        fld.setVisible(true);
    }

}
