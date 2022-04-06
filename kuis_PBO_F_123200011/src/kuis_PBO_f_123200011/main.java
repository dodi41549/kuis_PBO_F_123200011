/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_PBO_f_123200011;
/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int pilih;
        double tulis,coding,wawancara;
        double struktur,isi,kreatifS,bahasa;
        String nama,nik;
        System.out.println("-----------------------------");
        System.out.println("|  FORM PENDAFTARAN PT.UDIN |");
        System.out.println("-----------------------------");
        System.out.println("|  Input Pilihan DivisI     |");
        System.out.println("| 1. Android Development    |");
        System.out.println("| 2. Web Development        |");
        System.out.println("-----------------------------");
        System.out.print("Pilih Jenis Form : ");
        pilih = keyboard.nextInt();
        
        if (pilih == 1) {
            System.out.println("--------------------");
            System.out.println("| Form Pendaftaran |");
            System.out.println("--------------------");
            System.out.print("Input NIK   : ");
            nik = keyboard.next();
            
            System.out.print("Input Nama  : ");
            nama = keyboard.next();
            
             System.out.print("Input Nilai Tes Tulis  : ");
            tulis = keyboard.nextDouble();
            
             System.out.print("Input Nilai Tes Coding  : ");
            coding = keyboard.nextDouble();
            
             System.out.print("Input Nilai Tes Wawancara  : ");
            wawancara = keyboard.nextDouble();
            
            System.out.println("============");
            System.out.println("|   Menu   |");
            System.out.println("============");
            System.out.println("| 1. Tampil |");
            System.out.println("| 2. Edit   |");
            System.out.println("| 3. Exit   |");
            System.out.println("============");
            pilih = keyboard.nextInt();
            if (pilih == 1) {
                AndroidDevelopment AndroidDevelopment = new AndroidDevelopment (tulis,coding,wawancara);
                System.out.println("Hasil Akhir : " + AndroidDevelopment.hasil);
                if (AndroidDevelopment.hasil < 85) {
                    System.out.println("Keterangan : GAGAL");
                    System.out.println("Mohon maaf kepada " + nama + " Telah ditolak sebagai Android");
                }
                else if (AndroidDevelopment.hasil >= 85) {
                    System.out.println("Keterangan : LOLOS");
                    System.out.println("selamat kepada " + nama + " telah diterima sebagai android");
                }
            }
        }
        
        else if (pilih == 2) {
           System.out.println("--------------------");
            System.out.println("| Form Pendaftaran |");
            System.out.println("--------------------");
            System.out.print("Input NIK   : ");
            nik = keyboard.next();
            
            System.out.print("Input Nama  : ");
            nama = keyboard.next();
            
             System.out.print("Input Nilai Tes Tulis  : ");
            tulis = keyboard.nextDouble();
            
             System.out.print("Input Nilai Tes Coding  : ");
            coding = keyboard.nextDouble();
            
             System.out.print("Input Nilai Tes Wawancara  : ");
            wawancara = keyboard.nextDouble();
            
            System.out.println("============");
            System.out.println("|   Menu   |");
            System.out.println("============");
            System.out.println("| 1. Tampil |");
            System.out.println("| 2. Edit   |");
            System.out.println("| 3. Exit   |");
            System.out.println("============");
            pilih = keyboard.nextInt();
            if (pilih == 1) {
                WebDevelopment WebDevelopment = new WebDevelopment (tulis,coding,wawancara);
                System.out.println("Hasil Akhir : " + WebDevelopment.hasil);
                if (WebDevelopment.hasil < 85) {
                    System.out.println("Keterangan : GAGAL");
                    System.out.println("Mohon maaf kepada " + nama + " Telah ditolak sebagai Web");
                }
                else if (WebDevelopment.hasil >= 85) {
                    System.out.println("Keterangan : LOLOS");
                    System.out.println("selamat kepada " + nama + " telah diterima sebagai Web");
                }
            }
        }
    }
    
}
