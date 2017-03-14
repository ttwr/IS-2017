package model;


public class DoljnostnoeOborudovanie {
    private Integer id;
    private String name;
    private String harakteristika;
    private Float price;

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

    public String getHarakteristika() {
        return harakteristika;
    }

    public void setHarakteristika(String harakteristika) {
        this.harakteristika = harakteristika;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
   

}
