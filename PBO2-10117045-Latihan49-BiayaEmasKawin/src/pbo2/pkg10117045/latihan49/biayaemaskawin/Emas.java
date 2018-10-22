package pbo2.pkg10117045.latihan49.biayaemaskawin;

/**
 *
 * @author user
 */
public class Emas {
    private double beratEmas;
    private int hargaEmas;

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public int getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(int hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    
    public double totalBayar(double berat, int harga){
        return harga*berat;
    
    }
    
}
