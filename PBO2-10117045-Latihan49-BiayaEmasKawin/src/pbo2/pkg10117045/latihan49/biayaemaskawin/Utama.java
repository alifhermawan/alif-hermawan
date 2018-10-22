package pbo2.pkg10117045.latihan49.biayaemaskawin;

import java.util.Scanner;

public class Utama {

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menghitung total bayar
 * emas sesuai input berat dan harga emas sudah ditentukan
 */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Emas mas = new Emas();
        mas.setHargaEmas(570000);

        System.out.println("=====PROGRAM MENGHITUNG TOTAL BAYAR MAS KAWIN=====");
        System.out.print("Masukan berat emas kawin : ");
        mas.setBeratEmas(scn.nextDouble());
        System.out.println("Harga emas dibulan perbulan oktober : Rp.12" + mas.getHargaEmas()+"\n");
        System.out.println("Total harga emas kawin adalah : Rp." + mas.totalBayar(mas.getBeratEmas(), mas.getHargaEmas()));

    }
}
