package latihanModul4;

public class Latihan1_3Modul4 {
    public static void main(String[] args) {
        int A = 4;
        int B = 5;
        int pangkatA = 2;
        int hasilA = 1;

        for (int i = 0; i < pangkatA; i++) {
            hasilA *= A;
        }

        System.out.println("Hasil perhitungan adalah: " + (((hasilA + B)/B)+hasilA));
    }
}

