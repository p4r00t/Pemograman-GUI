/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author p4r00t
 */
public class DataPersonal {
    private StringProperty NamaDepan = new SimpleStringProperty();
    private StringProperty NamaBelakang = new SimpleStringProperty();
    private StringProperty Alamat = new SimpleStringProperty();
    private StringProperty KotaKabupaten = new SimpleStringProperty();
    private StringProperty NoHp = new SimpleStringProperty();

    public DataPersonal() {
    }
    
    public DataPersonal(String NamaDepan, String NamaBelakang) {
        //inisialisasi dari parameter
        this.NamaDepan = new SimpleStringProperty(NamaDepan);
        this.NamaBelakang = new SimpleStringProperty(NamaBelakang);
        //inisialisasi dengan nilai (untuk tes)
        this.Alamat = new SimpleStringProperty("Suatu Alamat");
        this.KotaKabupaten = new SimpleStringProperty("Suatu Kota");
        this.NoHp = new SimpleStringProperty("08777");
       
    }

    public String getNoHp() {
        return NoHp.get();
    }

    public void setNoHp(String value) {
        NoHp.set(value);
    }

    public StringProperty NoHpProperty() {
        return NoHp;
    }

    public String getKotaKabupaten() {
        return KotaKabupaten.get();
    }

    public void setKotaKabupaten(String value) {
        KotaKabupaten.set(value);
    }

    public StringProperty KotaKabupatenProperty() {
        return KotaKabupaten;
    }

    public String getAlamat() {
        return Alamat.get();
    }

    public void setAlamat(String value) {
        Alamat.set(value);
    }

    public StringProperty AlamatProperty() {
        return Alamat;
    }

    public String getNamaBelakang() {
        return NamaBelakang.get();
    }

    public void setNamaBelakang(String value) {
        NamaBelakang.set(value);
    }

    public StringProperty NamaBelakangProperty() {
        return NamaBelakang;
    }
    
    public String getNamaDepan() {
        return NamaDepan.get();
    }

    public void setNamaDepan(String value) {
        NamaDepan.set(value);
    }

    public StringProperty NamaDepanProperty() {
        return NamaDepan;
    }
    
}    
