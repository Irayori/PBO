/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaslingkaran;

/**
 *
 * @author Ira Yori
 */

import java.util.Scanner;
public class Luaslingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r,luas;
        Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Menghitung luas lingkaran");
        System.out.println("=========================");
        System.out.print("Masukkan jari-jari lingkaran : ");
            r = input.nextInt();
        luas = 3.14*r*r;
        System.out.println("Luas lingkaran : "+luas);// TODO code application logic here
    }
    
}
