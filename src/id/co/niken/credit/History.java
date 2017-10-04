/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.niken.credit;

/**
 *
 * @author nikenhapsari
 */
public class History {

    private Client client;
    private String kodeTransaksi;
    private String namaBarang;
    private Double hargaBarang;
    private Double hargaCicilan;
    private Integer jangkaWaktu;
    private Integer jatuhTempo;
    private Integer cicilanKe;
    private String keterangan;
    private Double denda;

    public History() {
    }

    public History(Client client, String kodeTransaksi, String namaBarang, Double hargaBarang, Double hargaCicilan, Integer jangkaWaktu, Integer jatuhTempo, Integer cicilanKe, String keterangan, Double denda) {
        this.client = client;
        this.kodeTransaksi = kodeTransaksi;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.hargaCicilan = hargaCicilan;
        this.jangkaWaktu = jangkaWaktu;
        this.jatuhTempo = jatuhTempo;
        this.cicilanKe = cicilanKe;
        this.keterangan = keterangan;
        this.denda = denda;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the kodeTransaksi
     */
    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    /**
     * @param kodeTransaksi the kodeTransaksi to set
     */
    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the hargaBarang
     */
    public Double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(Double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the jangkaWaktu
     */
    public Integer getJangkaWaktu() {
        return jangkaWaktu;
    }

    /**
     * @param jangkaWaktu the jangkaWaktu to set
     */
    public void setJangkaWaktu(Integer jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }

    /**
     * @return the jatuhTempo
     */
    public Integer getJatuhTempo() {
        return jatuhTempo;
    }

    /**
     * @param jatuhTempo the jatuhTempo to set
     */
    public void setJatuhTempo(Integer jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the cicilanKe
     */
    public Integer getCicilanKe() {
        return cicilanKe;
    }

    /**
     * @param cicilanKe the cicilanKe to set
     */
    public void setCicilanKe(Integer cicilanKe) {
        this.cicilanKe = cicilanKe;
    }

    /**
     * @return the denda
     */
    public Double getDenda() {
        return denda;
    }

    /**
     * @param denda the denda to set
     */
    public void setDenda(Double denda) {
        this.denda = denda;
    }

    /**
     * @return the hargaCicilan
     */
    public Double getHargaCicilan() {
        return hargaCicilan;
    }

    /**
     * @param hargaCicilan the hargaCicilan to set
     */
    public void setHargaCicilan(Double hargaCicilan) {
        this.hargaCicilan = hargaCicilan;
    }

}
