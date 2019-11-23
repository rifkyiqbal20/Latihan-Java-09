/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3.memasukan.nilai.dari.keyboard;

import java.util.Scanner;

/**
 * NAMA  : Muhamad Haidzir Ismail
 * NIM   : A2.1900113
 * Kelas : TI-1C
 * 
 * @author muhamadhaidzirismail
 */
public class L3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
                
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
