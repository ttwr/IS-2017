package model;


public class Doljnost {
    private Integer id;
    private String name;
    private Float oklad;
    private String obyazannost;
    private String trebovaniya;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getOklad() {
        return oklad;
    }

    public void setOklad(Float oklad) {
        this.oklad = oklad;
    }

    public String getObyazannost() {
        return obyazannost;
    }

    public void setObyazannost(String obyazannost) {
        this.obyazannost = obyazannost;
    }

    public String getTrebovaniya() {
        return trebovaniya;
    }

    public void setTrebovaniya(String trebovaniya) {
        this.trebovaniya = trebovaniya;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
    
}
