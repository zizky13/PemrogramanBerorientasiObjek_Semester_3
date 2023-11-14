package LatihanPertemuan9;
// faktorial tanpa menggunakan method
public class Latihan_Pertemuan9_16 {
    public static void main(String[] args) {
        int nilai = 1;
        int data = 4;
    
        if (data == 0 || data == 1){
            nilai = 1;
        }
        else{
            for(int i = 1; i <= data; i++){
                nilai *= i;
            }
        }
        System.out.println(data+"! = "+ nilai);
    }
    
}
