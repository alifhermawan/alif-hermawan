/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian;

import java.util.Scanner;

/**
 *
 * @author alip
 */
public class Latian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Selamat Datang Di Toko Pak Joni");
        Scanner scn = new Scanner(System.in);
        int jumlah, harga, total;
        System.out.println("Masukkan Jumlah Barang : ");
        jumlah = scn.nextInt();
        System.out.println("Masukkan Harga Barang : ");
        harga = scn.nextInt();
        total = harga*jumlah;
        System.out.println("Total yang harus di bayar : Rp." +total);
    }
    
}
