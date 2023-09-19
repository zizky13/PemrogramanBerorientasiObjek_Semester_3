package latihanModul4;
import javax.swing.*;

public class Latihan4_1Modul4 {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan input yang anda inginkan : ");
        int n = Integer.parseInt(angka);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
