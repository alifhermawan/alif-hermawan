/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author 
 * NAMA                 : Alif Hermawan
 * Kelas                : PBO-2
 * NIM                  : 10117045
 * Deskripsi Program    : Program Kambing lokal
 */
public class Kambing {
    
    public void tambahKambing(){
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        //Menampilkan jumlah kambing setelah ditambahkan
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambahkan : "+ 
                jumlahKambing +" ekor");
    }
    //Method menambahkan kambing Jantan baru
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
