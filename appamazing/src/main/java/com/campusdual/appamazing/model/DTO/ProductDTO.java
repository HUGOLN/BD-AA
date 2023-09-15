package com.campusdual.appamazing.model.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDTO {

    private int ID;
    private String name;

    private int stock;

    private BigDecimal proce;

    private boolean active;

    private Date date_added;


    //Getters y setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getProce() {
        return proce;
    }

    public void setProce(BigDecimal proce) {
        this.proce = proce;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }
}
