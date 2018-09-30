/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk mengeja huruf dari 
 *                        kata yang diinputkan
 */
public class PBO210117045Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama;
        int panjang; 
        char huruf; 
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan nama depan Anda untuk di eja : ");
        nama = scn.next();
        panjang = nama.length(); //jumlah huruf untuk looping
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");

        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}