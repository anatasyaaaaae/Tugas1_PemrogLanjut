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
public class MVC_ATM {
    Scanner scan = new Scanner (System.in);
    public Singleton_Tampil tampil;
    public DAO_ATM ATM;
    int pilih;
    
    MVC_ATM(){
        this.tampil = new Singleton_Tampil();
        this.ATM = new DAO_ATM();
        
        while(pilih !=4){
            pilih = tampil.pilihan();
            
            switch(pilih){
                case 1:
                    CekSaldo(this.ATM);
                    break;
                case 2: 
                    Tarik(this.ATM);
                    break;
                case 3:
                    Setor(this.ATM);
                    break;
                case 4:
                    System.out.println("\n      Sampai Jumpa");
                    break;
                default:
                    System.out.println("   Pilihan Tidak Valid!");
                    break;
            }
        }      
    }
    
    public void Setor(DAO_ATM saldoawal){    
    int jmlhuang;
        System.out.print("  Masukkan Jumlah Uang (Kelipatan 50.000): Rp ");
        jmlhuang = scan.nextInt();
        
        if(saldoawal.cek(jmlhuang) == 0){
        saldoawal.tambah(jmlhuang);
        System.out.println("   Transaksi Berhasil \n   Saldo Anda Bertambah Sejumlah: Rp "+jmlhuang);
        }
        else{
        System.out.println("   Transaksi Gagal \n   Jumlah Uang Yang Dimasukkan Harus Kelipatan 50.000");
        }
    }
 
    public void CekSaldo(DAO_ATM saldoawal){
        System.out.println("  Saldo Anda Saat Ini Rp "+saldoawal.saldo.getSaldo());
    }
    
    public void Tarik(DAO_ATM saldoawal){
            int jmlhuang;
            System.out.print("  Masukkan Jumlah Uang (Kelipatan 50.000): Rp ");
            jmlhuang = scan.nextInt();
            
            if(saldoawal.max()){
                System.out.println("\n   Transaksi Gagal Saldo Anda Mencapai Batas Minimal");
            }
            else if((saldoawal.getSaldo() - jmlhuang) < saldoawal.maxsaldo()){
                System.out.println("\n   Transaksi Gagal Jumlah Penarikan Melebihi Batas Minimal Saldo Anda");
            }
            else if((saldoawal.getSaldo() > jmlhuang) && (saldoawal.cek(jmlhuang)==0)){
                saldoawal.tarik(jmlhuang);
                System.out.println("   Transaksi Berhasil! \n   Anda Mengambil Uang Sejumlah : Rp "+jmlhuang);
            }
            else{
                System.out.println("   Transaksi Gagal \n   Jumlah Uang Yang Dimasukkan Harus Kelipatan 50.000");
            }
        }
}
