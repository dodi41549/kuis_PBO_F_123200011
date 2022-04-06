/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_PBO_f_123200011;

import development.web;
/**
 *
 * @author ASUS
 */
public class WebDevelopment implements web{
    double tulis,coding,wawancara;
    String nama,nik;
    double hasil;
     public WebDevelopment(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public WebDevelopment(double tulis, double coding, double wawancara) {
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }

    @Override
    public double tulis() {
        tulis = (tulis*40)/100;
        return tulis;
    }

    @Override
    public double coding() {
        coding = (coding*35)/100;
        return coding;
    }

    @Override
    public double wawancara() {
        wawancara = (wawancara*25)/100;
        return wawancara;
    }

    @Override
    public void hasil() {
        hasil = tulis+coding+wawancara;
    }
}
