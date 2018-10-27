/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polidaninheri;

import java.util.Scanner;

/**
 *
 * @author Ira Yori
 */
public class Polidaninheri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, alamat, blok;
        int tipe, bayar;              
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama = ");
        nama = input.nextLine();        
        
        System.out.print("Masukkan alamat = ");
        alamat = input.nextLine();        
        
        System.out.print("Masukkan blok = ");
        blok = input.nextLine();        
        
        System.out.print("Masukkan tipe = ");
        tipe = input.nextInt();        
        
        /*pelangganPLN.cetakHarga();*/
        
        System.out.print("Masukkan bayar = ");
        bayar = input.nextInt();
        
        user pelangganPLN = new user(nama, alamat, bayar, tipe, blok);
        //pelangganPLN.setBayar(bayar);
        
        System.out.println("\n=====DATA PELANGGAN=====");
        
        pelangganPLN.Tampilnama();
        pelangganPLN.Tampilalamat();
        pelangganPLN.Tampilbayar();
        pelangganPLN.cetakHarga();
        pelangganPLN.tampilKembalian();        
    }
    
}
