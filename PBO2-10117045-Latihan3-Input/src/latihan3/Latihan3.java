/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Alif Hermawan
 * Kelas                : PBO-2
 * NIM                  : 10117045
 * Deskripsi Program    : Program ini berisi perintah untuk memasukan nilai
 *                        dari keyboard
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan nama anda : ");
        Scanner scn = new Scanner(System.in);
        
        String nama = scn.next();
        System.out.println("Nama anda adalah : "+nama);
    }
    
}
