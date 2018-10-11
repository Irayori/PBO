/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapesawat;

/**
 *
 * @author Ira Yori
 */
import java.util.Scanner;
public class Datapesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,alamat,tipe;
        int bayar,harga = 0;
        double kembalian;
        
        System.out.print("Masukkan nama : ");
            nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
            alamat = input.nextLine();
        System.out.print("Masukkan tipe pesawat : ");
            tipe = input.nextLine();
        
        tipe = tipe.toUpperCase();
        
        if (tipe.equals("A"))
        {
            harga=5000000;
        }
        
        if (tipe.equals("B"))
        {
            harga=2000000;
        }
        
        else if (tipe.equals("C"))
        {
            harga = 1000000;
        }
        

        double price = harga;
        
        System.out.println("Harga tiket pesawat : " + String.format("Rp %,.2f", price));
        
        System.out.print("Bayar : ");
            bayar = input.nextInt();
            
        kembalian = bayar-harga;
        System.out.println("Kembalian : "+String.format("Rp %,.2f", kembalian));
        
        
        System.out.println("\n==========================");
        System.out.println("Nama       : "+nama);
        System.out.println("Alamat     : "+alamat);
        System.out.println("Kembalian  : "+String.format("Rp %,.2f", kembalian));
        System.out.println("============================");
// TODO code application logic here
    }
    
}
