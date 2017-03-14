package model;

import java.awt.Color;
import java.util.Date;


public class Avtomobil {
    
    private Integer id;
    private String marka;
    private Proizvoditel proizvoditel;
    private TipKyzova tipKyzova;
    private Date proizvodstvo;
    private Integer color;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Proizvoditel getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(Proizvoditel proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public TipKyzova getTipKyzova() {
        return tipKyzova;
    }

    public void setTipKyzova(TipKyzova tipKyzova) {
        this.tipKyzova = tipKyzova;
    }

    public Date getProizvodstvo() {
        return proizvodstvo;
    }

    public void setProizvodstvo(Date proizvodstvo) {
        this.proizvodstvo = proizvodstvo;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return id + " " + marka;
    }
    
    
            
    
    
    
}
