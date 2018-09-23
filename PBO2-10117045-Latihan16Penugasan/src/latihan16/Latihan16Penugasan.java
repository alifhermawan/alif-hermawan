/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan16;

/**
 *
 * @author
 * NAMA                 : Alif Hermawan
 * Kelas                : PBO-2
 * NIM                  : 10117045
 * Deskripsi Program    : Program Penugasan
 */
public class Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c +"\n");
        
        c =  a  + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c );
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 =" + c);
        c >>= 2;
        System.out.println("c <<= a = " + c);
        c &= a;
        System.out.println("c &= a = " + c);
        c ^= a;
        System.out.println("c ^= a = " + c);
        c |= a;
        System.out.println("c |= a = " + c);
    }
    
}
