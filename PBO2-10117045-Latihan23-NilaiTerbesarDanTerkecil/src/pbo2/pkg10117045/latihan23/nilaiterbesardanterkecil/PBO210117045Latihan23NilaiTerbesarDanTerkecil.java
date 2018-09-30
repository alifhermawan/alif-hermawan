/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung
 *                        nilai terbesar dan terkecil
 */
public class PBO210117045Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String petugas;
        int nMhs;
        int nBesar;
        int nKecil;
        int nilaiMhs[] = new int[20];
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
        nBesar = 0;
        nKecil = 100;

        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs[i] = scn.nextInt();
            
            nBesar = ((nBesar<=nilaiMhs[i])?nilaiMhs[i]:nBesar);
            nKecil = ((nKecil>=nilaiMhs[i])?nilaiMhs[i]:nKecil);
        }
        System.out.println("\n"+"======Hasil Nilai Mahsiswa======");
         for (int i = 1; i <= nMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-"+i+" = " + nilaiMhs[i]);

        }
        
//        menampilkan hasil dari nilai terbesar dan nilai terkecil
        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        System.out.println("\n"+"Petugas : "+ petugas);
    }
    
}
