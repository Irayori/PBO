/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayarpln;

/**
 *
 * @author Ira Yori
 */
import java.util.Scanner;

class Pln {
    String nama;
    String alamat;
    int tiperumah;
    String blok;
    int bayar, kembalian;
    
    /** methode **/
    void cetakPln() {
        System.out.println("Nama = "+nama);
        System.out.println("Alamat = "+alamat);
        /*System.out.println("Harga = "+harga_bayar);*/
        System.out.println("Harga = "+bayar);
        System.out.println("Kembalian = "+kembalian);
    }
        
}


public class Bayarpln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, alamat, blok;
        int bayar, harga = 0,kembalian, tipe_rumah;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();
        System.out.print("Masukkan tipe blok = ");
        blok = input.nextLine();
        
        System.out.print("Masukkan tipe rumah = ");
        tipe_rumah = input.nextInt();
        
        blok = blok.toUpperCase();
        
        switch(tipe_rumah){
            case 36: 
                switch(blok){
                    case "A" :
                        harga = 500000;
                        break;
                    case "B":
                        harga = 300000;
                        break;
                }
                break;
            case 37:
                switch(blok){
                    case "A" :
                        harga = 800000;
                        break;
                    case "B":
                        harga = 600000;
                        break;
                }
                
        }
        System.out.println("\nHarga = "+ harga);
        System.out.print("Masukkan harga bayar = ");
        bayar= input.nextInt();
        kembalian = bayar-harga;
        System.out.println("Kembalian = "+kembalian);        
        
        System.out.println("=== DATA PEMBAYARAN PLN ===");
        Pln datapln = new Pln();
        datapln.nama = nama;
        datapln.alamat = alamat;
        datapln.bayar= bayar;
        datapln.kembalian= kembalian;
        /*panggil method*/
        datapln.cetakPln();
    }
    
}
