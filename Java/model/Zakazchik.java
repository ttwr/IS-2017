package model;

import java.util.Date;


public class Zakazchik {
    private String fio;
    private String adres;
    private String phone;
    private String pasport;
    private Avtomobil avtomobil;
    private Date dateOrder;
    private Date dateSale;
    private String otmetkaVipolneniya;
    private String otmetkaOplati;
    private String protsentPredoplati;
    private Sotrudnik sotrudnik;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    public Avtomobil getAvtomobil() {
        return avtomobil;
    }

    public void setAvtomobil(Avtomobil avtomobil) {
        this.avtomobil = avtomobil;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Date getDateSale() {
        return dateSale;
    }

    public void setDateSale(Date dateSale) {
        this.dateSale = dateSale;
    }

    public String getOtmetkaVipolneniya() {
        return otmetkaVipolneniya;
    }

    public void setOtmetkaVipolneniya(String otmetkaVipolneniya) {
        this.otmetkaVipolneniya = otmetkaVipolneniya;
    }

    public String getOtmetkaOplati() {
        return otmetkaOplati;
    }

    public void setOtmetkaOplati(String otmetkaOplati) {
        this.otmetkaOplati = otmetkaOplati;
    }

    public String getProtsentPredoplati() {
        return protsentPredoplati;
    }

    public void setProtsentPredoplati(String protsentPredoplati) {
        this.protsentPredoplati = protsentPredoplati;
    }

    public Sotrudnik getSotrudnik() {
        return sotrudnik;
    }

    public void setSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudnik = sotrudnik;
    }

    @Override
    public String toString() {
        return fio + " " + adres + " " + phone + " " + avtomobil + " " + dateSale + " " + sotrudnik;
        
    }
    
    
}
