package pbo2.pkg10117045.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk mmenghitung energi 
 * kinetik dan usaha bola berdasarkan massa dan kecepatan yang telah ditentukan
 */
public class Utama {

    public static void main(String[] args) {
        Bola bol = new Bola(145, 25);

        // diketahui
        System.out.println("Bola Baseball dilembar dengan ketentuan :\n");
        System.out.print("Massa \t\t= " + bol.getMassa() + " gram");
        bol.setMassa(bol.getMassa() / 1000);
        System.out.println(" atau " + bol.getMassa() + " kilogram");
        System.out.println("Kecepatan \t= " + bol.getKecepatan() + " m/s");

        //ditanyakan
        System.out.println("\nA. Memiliki Energi Kinetik = " + bol.hitungEnergiKinetik() + " joule");

        System.out.println("B. Usaha yang dilakukan pada bola untuk mencapai "
                + "\n\tkecepatan ini, jika dumulai dari "
                + "keadaan diam \n\t = "
                + bol.hitungUsaha(0, 25) + " joule");
    }
}
