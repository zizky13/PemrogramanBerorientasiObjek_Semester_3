package LatihanPertemuan5;

public class Ratarata {
    public static void main(String[] args) {
        double[] contoh = new double[30];
        for (int i = 0; i < 30; i++) {
            contoh[i] = 100 * Math.random();
        }
        double ratarata = 0.0;
        for (int i = 0; i < 30; i++) {
            ratarata += contoh[i];
        }
        ratarata /= 30;
        System.out.println("Mean 30 bilangan random: " + ratarata);

    }
}
