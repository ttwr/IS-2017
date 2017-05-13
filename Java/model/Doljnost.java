package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Doljnost {
    private Integer id;
    private String name;
    private Float oklad;
    private String obyazannost;
    private String trebovaniya;
    private final PropertyChangeSupport prop;

    public Doljnost() {
            prop = new PropertyChangeSupport(this);
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer old = this.id;
        this.id = id;
        prop.firePropertyChange("id", old, id);
              
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String old = this.name;
        this.name = name;
        prop.firePropertyChange("name", old, name);
              
    }

    public Float getOklad() {
        return oklad;
    }

    public void setOklad(Float oklad) {
        Float old = this.oklad;
        this.oklad = oklad;
        prop.firePropertyChange("oklad", old, oklad);
              
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
         String old = this.trebovaniya;
        this.trebovaniya = trebovaniya;
        prop.firePropertyChange("trebovaniya", old, trebovaniya);
              
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
     public void addPropertyChangeListener
        (PropertyChangeListener listener) {
        prop.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener
        (PropertyChangeListener listener) {
        prop.removePropertyChangeListener(listener);
    }

    
    
}
