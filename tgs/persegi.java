/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs;
import java.util.Scanner;
/**
 *
 * @author HP 240 G8
 */
public class persegi {
       public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int s;
        double luas;
        double keliling;
        
        System.out.print("Masukkan sisi : ");
        s = input.nextInt();
        
        luas = s*s;
        System.out.println("Luas persegi : " +luas);
        keliling = 4*s;
        System.out.println("keliling segitiga : " +keliling);
    } 
}
