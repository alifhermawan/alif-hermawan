/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author 
 * NAMA                 : Alif Hermawan
 * Kelas                : PBO-2
 * NIM                  : 10117045
 * Deskripsi Program    : Program kambing global
 */
public class KambingGlobal {

// Variabel jumlah kambing menjadi variabel instance
int jumlahKambing = 88;
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : "+ jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : "+ jumlahKambing);
    }
    
}
