package LatihanPertemuan5;
import javax.swing.*;


public class Latihan2_1Week5 {
    public static void main(String[] args) {
        int dataInt[] = new int[10];
        String dataString[] = new String[10];
        String idxString, strBaru;
        int idxInt,intBaru;

        for (int i = 0; i < dataInt.length; i++) {
            dataString[i] = JOptionPane.showInputDialog("Masukkan elemen indeks ke- "+i);
            dataInt[i] = Integer.parseInt(dataString[i]);
            System.out.print("Index ke"+i+" adalah "+dataInt[i]);
            System.out.println("");
        }
        //penyelesaian soal A dan B
        int max = dataInt[0];
        int min = dataInt[0];
        int sum = 0;
        for (int i = 0; i < dataInt.length - 1; i++) {
            max = Math.max(max,dataInt[i+1]);
            min = Math.min(min,dataInt[i+1]);
            sum += dataInt[i];
        }

        //print hasil untuk soal A dan B
        System.out.println("");
        System.out.println("Nilai max adalah: "+ max);
        System.out.println("Nilai min adalah: "+ min);
        System.out.println("Nilai rata-rata adalah: "+ (sum/dataInt.length));

        System.out.println("Elemen original dari array adalah: ");
        for (int data:dataInt) {
            System.out.print(data + " ");
        }
        idxString = JOptionPane.showInputDialog("Masukkan indeks array yang ingin ditukar: ");
        idxInt = Integer.parseInt(idxString);
        strBaru = JOptionPane.showInputDialog("Masukkan angka baru: ");
        intBaru = Integer.parseInt(strBaru);
        dataInt[idxInt] = intBaru;

        System.out.println(" ");
        System.out.println("Elemen dari array baru adalah: ");
        for (int data:dataInt) {
            System.out.print(data + " ");
        }

    }
}
