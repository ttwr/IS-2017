package model;


public class Sotrudnik {
    private Integer id;
    private String fio;
    private String gender;
    private String adres;
    private String phone;
    private String pasport;
    private Doljnost doljnost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Doljnost getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(Doljnost doljnost) {
        this.doljnost = doljnost;
    }

    @Override
    public String toString() {
        return id + " " + fio + " " + phone + " " + doljnost;
    }

    
    
}
