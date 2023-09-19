package latihanModul4;
import javax.swing.JOptionPane;

public class Latihan2_2Modul4 {
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

        switch (input){
            case 10:
                JOptionPane.showMessageDialog(null,"Sepuluh");
                break;
            case 9:
            JOptionPane.showMessageDialog(null,"Sembilan");
                break;
            case 8:
            JOptionPane.showMessageDialog(null,"Delapan");
                break;
            case 7:
            JOptionPane.showMessageDialog(null,"Tujuh");
                break;
            case 6:
            JOptionPane.showMessageDialog(null,"Enam");
                break;
            case 5:
            JOptionPane.showMessageDialog(null,"Lima");
                break;
            case 4:
            JOptionPane.showMessageDialog(null,"Empat");
                break;
            case 3:
            JOptionPane.showMessageDialog(null,"Tiga");
                break;
            case 2:
            JOptionPane.showMessageDialog(null,"Dua");
                break;
            case 1:
            JOptionPane.showMessageDialog(null,"Satu");
                break;
        }

    }
}
