/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung 
 *                        saldo tabungan
 */
public class PBO210117045Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo, bulan;
        double bunga;

        saldo = 2500000;
        bulan = 0;
        while (bulan < 6) {
            bulan = bulan + 1;
            saldo = (int) (saldo + (saldo * 0.15));

            String mataUang = String.format("Rp.%,3d", saldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + bulan + " %s%n", mataUang);
        }
    }

}
