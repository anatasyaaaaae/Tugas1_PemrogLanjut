/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_1;

/**
 *
 * @author sarah
 */
public class DAO_ATM implements ATM_DAO{
    MVC_SaldoATM saldo;
    
    public DAO_ATM(){
        this.saldo = new MVC_SaldoATM();
    }
    
    public int maxsaldo(){
        return this.saldo.min;
    }

    @Override
    public int getSaldo() {
        return this.saldo.getSaldo();
    }

    @Override
    public void tambah(int atm) {
        saldo.setSaldo(saldo.getSaldo() + atm);
    }

    @Override
    public void tarik(int atm) {
        saldo.setSaldo(saldo.getSaldo() - atm);
    }

    @Override
    public boolean max() {
        if(this.saldo.getSaldo()<= this.saldo.min){
            return true;
        }
        else{
            return false;
        }    
    }

    @Override
    public int cek(int atm) {
        if(atm % 50000 !=0){
            return 1;
        }
        return 0;
    }
}
