package latihanModul4;

public class CobaFor1 {
    public static void main(String[] args) {
        //inisiasi awal for-loop, perulangan hingga jari mendekati 2
        //hal menarik terjadi ketika saya berkesperimen dengan nilai jari += 0.2
        //ketika nilai diganti ke yang lebih presisi (hingga 0.0000001) nilai jari tidak pernah menyentuh 2
        for (double jari = 1.0; jari <= 2.0 ; jari+= 0.2) {
            System.out.println("Radius = " + jari + " Luas = "+ jari * Math.PI * jari);
            //menampilkan nilai jari dan luas pada tiap iterasi
        }
    }
}
