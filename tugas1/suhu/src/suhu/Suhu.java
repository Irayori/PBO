/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author Ira Yori
 */

import java.util.Scanner;
public class Suhu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celcius,fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Konversi suhu dari celcius ke fahrenheit");
        System.out.println("========================================");
        System.out.print("Suhu dalam Celciius : ");
            celcius = input.nextInt();
        fahrenheit = (celcius*9/5)+32;
        System.out.println("Suhu dalam Fahrenheit : "+fahrenheit+" F");
        System.out.println("========================================");
        System.out.println("Konversi suhu dari fahrenheit ke celcius");
        System.out.println("========================================");
        System.out.print("Suhu dalam Fahrenheit : ");
            fahrenheit = input.nextInt();
        celcius = (fahrenheit*5/9)+32;
        System.out.println("Suhu dalam Celcius : "+celcius+" C");// TODO code application logic here
    }
    
}
