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
public class lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int r;
        double phi;
        double luas;
        double keliling;
        
        phi = 3.14;
        
        System.out.print("Masukkan sisi r : ");
        r = input.nextInt();

        
        luas = phi*r*r;
        System.out.println("Luas segitiga : " +luas);
        keliling = 2*phi*r;
        System.out.println("Keliling segitiga : " +keliling);
    }
}
