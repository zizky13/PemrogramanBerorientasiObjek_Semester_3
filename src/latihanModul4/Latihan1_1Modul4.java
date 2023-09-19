package latihanModul4;

public class Latihan1_1Modul4 {
    public static void main(String[] args) {
        int A = 4;
        int B = 5;
        int pangkatA = 3;
        int pangkatB = 2;

        int hasilA = 1;
        int hasilB = 1;
        for (int i = 0; i < pangkatA; i++) {
            hasilA *= A;
            if (i < pangkatB) {
                hasilB *= B;
            }
        }
        System.out.println("Hasil perhitungan: " + (hasilA + hasilB));
    }
}
