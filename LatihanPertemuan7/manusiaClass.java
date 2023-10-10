package LatihanPertemuan7;

public class manusiaClass {
    private String nama;
    private int umur;
    public void setNama(String a){
        nama = a;
    }
    public String getNama(){
        return nama;
    }
    public void setUmur(int a){
        umur = a;
    }
    public int getUmur(){
        return umur;
    }
}

class manusiaBaru{

    public static void main(String[] args) {
        manusiaClass org1 = new manusiaClass();
        manusiaClass org2 = new manusiaClass();

        org1.setNama("Budi");
        org1.setUmur(19);

        org2.setNama("Rani");
        org2.setUmur(22);

        System.out.println(org1.getNama());
        System.out.println(org1.getUmur());

        System.out.println(org2.getNama());
        System.out.println(org2 .getUmur());

    }

}
