/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgaji;

/**
 *
 * @author FADHILAHKH21103100
 */
public class Commission extends Employee{
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public Commission(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}
