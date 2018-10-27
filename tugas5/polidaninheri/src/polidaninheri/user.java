/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polidaninheri;

/**
 *
 * @author Ira Yori
 */
public class user extends hargabayar{
    protected String nama;
    protected String alamat;
    protected int bayar;
    protected int kembalian;
    /*protected int tipe;
    protected String blok;*/
    protected int harga;
    
    
    public user(String nama, String alamat, int bayar, int tipe, String blok){
        super(tipe,blok);
        this.harga = getHarga();
        this.nama = nama;
        this.alamat = alamat;
        this.bayar = bayar;
    }
    
    
    public int getHarga(){
        switch(this.tipe){
            case 36: 
                switch(this.blok){
                    case "A" :
                        this.harga = 500000;
                        break;
                    case "B":
                        this.harga = 300000;
                        break;
                }
                break;
            case 37:
                switch(blok){
                    case "A" :
                        this.harga = 800000;
                        break;
                    case "B":
                        this.harga = 600000;
                        break;
                }
                
        }        
        return this.harga;
    }
    
    public void cetakHarga(){
        System.out.println("Harga = "+getHarga());
    }
           
    
    public void Tampilnama(){
        System.out.println("Nama = "+nama);
    }
    
    public void Tampilalamat(){
        System.out.println("Alamat = "+alamat);
    }
    
    public void Tampilbayar(){
        System.out.println("Bayar = "+bayar);
    }
    
    public void tampilKembalian(){
        kembalian = bayar - getHarga();
        System.out.println("kembalian = "+kembalian);
    }
}
