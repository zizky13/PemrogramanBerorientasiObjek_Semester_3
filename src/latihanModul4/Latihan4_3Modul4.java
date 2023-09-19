package latihanModul4;

import javax.swing.*;

public class Latihan4_3Modul4 {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan input yang anda inginkan : ");
        int height = Integer.parseInt(angka);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < height - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            for (int k = height - i - 1; k >= 0 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
