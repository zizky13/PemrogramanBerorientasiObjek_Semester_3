package Pertemuan9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class inputConsole {
    public static String readString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = " ";
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public int readInt() {
        return Integer.parseInt(readString());
    }

    public double readDouble() {
        return Double.parseDouble(readString());
    }

}

class Volume {
    public void tabung(double luas_Lingkaran, int t) {
        System.out.println("Volume tabung = " + luas_Lingkaran * t);
    }

    public void kerucut(double luas_Lingkaran, int t) {
        ;
        System.out.println("Volume kerucut = " + luas_Lingkaran * t * 1 / 3);
    }

    public void bola(double luas_Lingkaran, int d) {
        int r = d / 2;
        System.out.println("Volume bola = " + luas_Lingkaran * r * 4 / 3);
    }
}

public class Latihan_Pertemuan9_17 {

    public double luas_lingkaran(int d) {
        int jari2 = d / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }

    public static void main(String[] args) {
        inputConsole ic = new inputConsole();
        Latihan_Pertemuan9_17 luas = new Latihan_Pertemuan9_17();
        Volume volume = new Volume();
        
        System.out.print("Masukkan Diameter: ");
        int diameter = ic.readInt();
        double luas_Lingkaran = luas.luas_lingkaran(diameter);
        System.out.print("Masukkan Tinggi: ");
        int tinggi = ic.readInt();
        volume.tabung(luas_Lingkaran, tinggi);
        volume.kerucut(luas_Lingkaran, tinggi);
        volume.bola(luas_Lingkaran, diameter);
    }
}
