package LatihanPertemuan7;

public class phone {
    private String merk;
    private int harga;
    public phone(){}
    public phone(String merk){
        this.merk = merk;
    }
    public phone (String merk, int harga){
        this.merk = merk;
        this.harga = harga;
    }
    public void isiPhone (String merk){
        this.merk = merk;
    }
    public void isiPhone (String merk, int harga){
        this.merk = merk;
        this.harga = harga;
    }
    public void lihatPhone(){
        System.out.println(" Merk :" + merk);
        System.out.println(" Harga :" + harga);
        System.out.println(" ");
    }
}

