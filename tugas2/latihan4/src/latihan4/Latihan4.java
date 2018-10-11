/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Ira Yori
 */
import java.util.Scanner;
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai1,nilai2,nilai3,nilai4,nilai5;
        int max,min;
        
        System.out.print("masukkan nilai 1 : ");
            nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2 : ");
            nilai2 = input.nextInt();
        System.out.print("Masukkan nilai 3 : ");
            nilai3 = input.nextInt();
        System.out.print("Masukkan nilai 4 : ");
            nilai4 = input.nextInt();
        System.out.print("Masukkan nilai 5 : ");
            nilai5 = input.nextInt();

        max = nilai1;
        min = nilai1;
        
        if (nilai2 > max)
        {   
         max = nilai2;
        }
        
        if (nilai3 > max)
        {
         max = nilai3;
        }
        
        if (nilai4 > max)
        {
         max = nilai4;
        }
        
        if (nilai5 > max)
        {
         max = nilai5;
        }
        
        System.out.println("Nilai max : "+max);
        
        if (nilai2 < min)
        {
         min = nilai2;
        }      
        
        if (nilai3 < min)
        {
         min = nilai3;
        }
       
        if (nilai4 < min)
        {
         min = nilai4;
        }
       
        if (nilai5 < min)
        {
         min = nilai5;
        }
        
        System.out.println("Nilai min : "+min);
    // TODO code application logic here

    }
}    