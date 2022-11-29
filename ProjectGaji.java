/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectgaji;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author FADHILAHKH21103100
 */
public class ProjectGaji {

    public static void main(String[] args) {
        Salaried se = new Salaried();
        Commission Commission = new Commission();
        ProjectPlanner pp = new ProjectPlanner();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.Nama = br.readLine();
            System.out.print("NIP: ");
            se.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok = Float.parseFloat(br.readLine());
            se.TampilData();
            
            System.out.print("Nama: ");
            Commission.Nama = br.readLine();
            System.out.print("NIP: ");
            Commission.NIP = br.readLine();
            System.out.print("GajiPokok: ");
            Commission.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            Commission.Komisi = Float.valueOf(br.readLine());
            System.out.print("Total Penjualan: ");
            Commission.TotalPenjualan = Float.valueOf(br.readLine());
            Commission.TotalGaji();
            Commission.TampilData();
            
            System.out.print("Nama: ");
            pp.Nama = br.readLine();
            System.out.print("NIP: ");
            pp.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek = Float.parseFloat(br.readLine());
            pp.TotalGaji();
            pp.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}

