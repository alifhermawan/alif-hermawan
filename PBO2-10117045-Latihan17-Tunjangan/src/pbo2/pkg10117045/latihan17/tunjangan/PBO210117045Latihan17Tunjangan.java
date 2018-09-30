/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Alif Hermawan
 * Kelas                : PBO-2
 * NIM                  : 10117045
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung gaji 
 *                        total
 */
public class PBO210117045Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        double tunjangan;
        String status;
        double totalGaji;

        Scanner scan = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = scan.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum)\t: ");
        status = scan.next();
        
        System.out.println("\n"+"=========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok\t\t: Rp. " + gajiPokok);

        //tunjangan
        if (status.equals("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total gaji\t\t: Rp. " + totalGaji);
        System.out.println("Developed By : Alif Hermawan");
    }

}
