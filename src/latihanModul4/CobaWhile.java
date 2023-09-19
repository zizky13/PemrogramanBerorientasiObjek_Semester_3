package latihanModul4;

public class CobaWhile {
    public static void main(String[] args) {
        double r = 0;//inisiasi nilai awal
        while (r<0.99d){//menyatakan kondisi while
            r = Math.random();//inisiasi nilai r agar perulangan berhenti pada suatu titik
            System.out.println(r);//menampilkan nilai r sebelum perulangan berhenti
        }
    }
}
