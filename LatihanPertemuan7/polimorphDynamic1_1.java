package LatihanPertemuan7;

abstract class Hewan{
    protected abstract void munculSuara();
}

class Kucing extends Hewan{
    @Override
    protected void munculSuara() {
        System.out.println("Suara kucing: meow.... meow.... meow....");
    }
}

class Burung extends Hewan{
    @Override
    protected void munculSuara() {
        System.out.println("Suara burung: cit.... cit.... cit...");
    }
}

public class polimorphDynamic1_1 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();

        Hewan burung = new Burung();
        burung.munculSuara();
    }
}
