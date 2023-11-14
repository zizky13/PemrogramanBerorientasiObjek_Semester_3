package LatihanPertemuan9;

public class Latihan_Pertemuan9_9 {
    public static void main(String[] args) {
        try {
            throw new Exception("Throwing an exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
