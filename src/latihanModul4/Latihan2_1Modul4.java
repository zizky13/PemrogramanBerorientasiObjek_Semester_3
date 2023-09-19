package latihanModul4;
import javax.swing.JOptionPane;

public class Latihan2_1Modul4 {
    public static void main(String[] args) {
            String inp = JOptionPane.showInputDialog("Masukkan angka 1 - 10: ");
            int input = Integer.parseInt(inp);
            if (input > 10){
                do {
                    JOptionPane.showMessageDialog(null,"Invalid number!!");
                    inp = JOptionPane.showInputDialog("Masukkan angka 1 - 10: ");
                    input = Integer.parseInt(inp);
                } while (input > 10);
            }

            if (input == 10){
                JOptionPane.showMessageDialog(null, "Sepuluh");
            } else if (input == 9) {
                JOptionPane.showMessageDialog(null, "Sembilan");
            } else if (input == 8) {
                JOptionPane.showMessageDialog(null, "Delapan");
            } else if (input == 7) {
                JOptionPane.showMessageDialog(null, "Tujuh");
            } else if (input == 6) {
                JOptionPane.showMessageDialog(null, "Enam");
            } else if (input == 5) {
                JOptionPane.showMessageDialog(null, "Lima");
            } else if (input == 4) {
                JOptionPane.showMessageDialog(null, "Empat");
            } else if (input == 3) {
                JOptionPane.showMessageDialog(null, "Tiga");
            } else if (input == 2) {
                JOptionPane.showMessageDialog(null, "Dua");
            } else if (input == 1) {
                JOptionPane.showMessageDialog(null, "Satu");

            }


    }
}
