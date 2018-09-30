/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author 
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan waktu 
 *                        saat ini
 */
public class PBO210117045Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
     Date date = new Date();
     Calendar cal = Calendar.getInstance();
     int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
     //format tanggal & waktu
     SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
     //array hari
     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +formatIndo.format(date));
    }
}