package com.itheima;

/**
 * @author boyizhang
 */
class Car {
    private Integer id;
    private String brand;

    Car(Integer id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
