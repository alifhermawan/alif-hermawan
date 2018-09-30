/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan18.kelipatan;

/**
 *
 * @author 
 * NAMA                 : Alif Hermawan
 * Kelas                : PBO-2
 * NIM                  : 10117045
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung bilangan
 *                        kelipatan 3,5 dimulai dari 3,5 sampai dengan 35
 */
public class PBO210117045Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bilangan;
        
        bilangan = 0;
        
        while (bilangan < 35) {
          bilangan = bilangan + 3.5;
          System.out.println(bilangan);
        }
    }
    
}
