package model;


public class TipKyzova {
    private Integer id;
    private String name;
    private String opisanie;

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

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
}
