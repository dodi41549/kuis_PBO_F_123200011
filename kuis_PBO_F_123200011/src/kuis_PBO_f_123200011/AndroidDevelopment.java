/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_PBO_f_123200011;

import development.android;
/**
 *
 * @author ASUS
 */
public class AndroidDevelopment implements android {
    double tulis,coding,wawancara;
    String nama,nik;
    double hasil;
    public AndroidDevelopment(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    AndroidDevelopment(double tulis, double coding, double wawancara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double tulis() {
        tulis = (tulis*20)/100;
        return tulis;
    }

    @Override
    public double coding() {
        coding = (coding*50)/100;
        return coding;
    }

    @Override
    public double wawancara() {
        wawancara = (wawancara*30)/100;
        return wawancara;
    }

    @Override
    public void hasil() {
        hasil = tulis+coding+wawancara;
    }
}
