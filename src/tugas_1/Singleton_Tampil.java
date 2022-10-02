/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_1;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Singleton_Tampil {
        Scanner scan = new Scanner (System.in);
        private static Singleton_Tampil tampil = new Singleton_Tampil();
        
        public Singleton_Tampil (){}
        
        public static Singleton_Tampil getInstance(){
           return tampil;
        }
        
        public int pilihan(){
            System.out.println("|===================================|");
            System.out.println("|  Selamat Datang di ATM Bank Krut  |");
            System.out.println("|===================================|");
            System.out.println("|          1. Cek Saldo             |");
            System.out.println("|          2. Tarik Tunai           |");
            System.out.println("|          3. Setor Tunai           |");
            System.out.println("|          4. Batal                 |");
            System.out.println("|===================================|");
            System.out.print("  Masukkan Pilihan Anda :");
            return scan.nextInt();
        }
}

