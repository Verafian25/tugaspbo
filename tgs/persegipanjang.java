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
public class persegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int p,l;
        double luas;
        double keliling;
        
        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        
        luas = p*l;
        System.out.println("Luas segitiga : " +luas);
        keliling = 2*p+l;
        System.out.println("keliling segitiga : " +keliling);
    }
}
