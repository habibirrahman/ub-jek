package UBJek;

public class UBJek {

    private String driver;
    private double pendapatan;
    private static double pendapatanUBJek;
    private Penumpang[] penumpang = new Penumpang[999];
    private int urut = 0;

    public UBJek(String driver) {
        this.driver = driver;
        urut = 0;
    }

    public void newCostumer(Penumpang p) {
        penumpang[urut] = new Penumpang(p.nama, p.jarak);
        payment();
        urut++;
    }

    public void payment() {
        this.pendapatan += penumpang[urut].jarak * 5000;
        this.pendapatanUBJek += penumpang[urut].jarak * 5000;
    }

    public void cetakPenumpang() {
        System.out.println("Penumpang Driver " + (this.driver));
        System.out.println("List penumpang : ");
        for (int i = 0; i < urut; i++) {
            System.out.println((i + 1) + ". " + penumpang[i].nama + " (km " + penumpang[i].jarak + ")");
        }
    }

    public String toString() {
        return "Pendapatan Driver " + this.driver + " = Rp" + this.pendapatan;
    }

    public void omsetUbJek() {
        System.out.println("Pendapatan perusahaan UBJek = Rp"+this.pendapatanUBJek);
    }
    
    
}
