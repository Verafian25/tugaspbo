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
public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,t;
        double luas;
        double keliling;
        
        System.out.print("Masukkan sisi a : ");
        a = input.nextInt();
        System.out.print("Masukkan sisi t : ");
        t = input.nextInt();
        
        luas = 0.5*a*t;
        System.out.println("Luas segitiga : " +luas);
        
    }
}
