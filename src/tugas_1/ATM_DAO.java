/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tugas_1;

/**
 *
 * @author sarah
 */
public interface ATM_DAO {
    int getSaldo();
    
    void tambah(int atm);
    
    void tarik(int atm);
    
    boolean max();
    
    int cek(int atm);
}
