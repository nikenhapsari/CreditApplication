/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.niken.credit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nikenhapsari
 */
public class Client {
    private String kode;
    private String nama;
    private Integer umur;
    private String jenisKelamin;
    private Boolean status;
    private Double gaji;
    private String alamat;
    private Date tanggalLahir;
    private Integer jumlahTanggungan;
    private String noHP;
    private String noRumah;
    private List<History> history;

    public Client() {
        history = new ArrayList<>();
    }

    public Client(String kode, String nama, Integer umur, String jenisKelamin, Boolean status, Double gaji, String alamat, Date tanggalLahir, Integer jumlahTanggungan, String noHP, String noRumah) {
        this.kode = kode;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.gaji = gaji;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.jumlahTanggungan = jumlahTanggungan;
        this.noHP = noHP;
        this.noRumah = noRumah;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the umur
     */
    public Integer getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the gaji
     */
    public Double getGaji() {
        return gaji;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the jumlahTanggungan
     */
    public Integer getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    /**
     * @param jumlahTanggungan the jumlahTanggungan to set
     */
    public void setJumlahTanggungan(Integer jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    /**
     * @return the noHP
     */
    public String getNoHP() {
        return noHP;
    }

    /**
     * @param noHP the noHP to set
     */
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    /**
     * @return the noRumah
     */
    public String getNoRumah() {
        return noRumah;
    }

    /**
     * @param noRumah the noRumah to set
     */
    public void setNoRumah(String noRumah) {
        this.noRumah = noRumah;
    }

    /**
     * @return the history
     */
    public List<History> getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(List<History> history) {
        this.history = history;
    }
}
