/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_1;

/**
 *
 * @author sarah
 */
public class MVC_SaldoATM { 
    public int min = 100000;
    private int saldoawal = 500000;  
    
    
    public int getSaldo() {
        return saldoawal;
    }
    
    public void setSaldo(int saldoawal){
        this.saldoawal = saldoawal;
    }
}
