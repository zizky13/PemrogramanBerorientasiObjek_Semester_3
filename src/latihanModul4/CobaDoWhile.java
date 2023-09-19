package latihanModul4;

public class CobaDoWhile {
    public static void main(String[] args) {
        double r = 0;//inisiasi nilai awal
        do {
            r = Math.random();//mengupdate nilai r agar tidak terjadi for loop
            System.out.println(r);//print nilai r
        } while (r<0.99d);//kondisi agar loop berhenti
        //hal yang membedakan while dan doWhile adalah
        //doWhile setidaknya akan berjalan 1 kali walaupun kondisi = false
    }
}
