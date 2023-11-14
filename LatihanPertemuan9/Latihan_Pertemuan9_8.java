package LatihanPertemuan9;

public class Latihan_Pertemuan9_8 {
        double method(int i) throws Exception {
            return 1 / 0;
        }
    
        boolean method(boolean b) {
            return b;
        }
    
        double method(int x, double y) throws Exception {
            return x + y;
        }
    
        double method(double x, double y) {
            return x + y - 3;
        }

        public static void main(String[] args) {
            Latihan_Pertemuan9_8 mn = new Latihan_Pertemuan9_8();
            try {
                System.out.println(mn.method(10, 20.0));
                System.out.println(mn.method(10.0, 20));
                System.out.println(mn.method(10.0, 20.0));
                System.out.println(mn.method(10));
            } catch (Exception ex) {
                System.out.println("Exception occurred: " + ex);
            }
        }
    }
    

