package bean;

import java.io.Serializable;

public class ProductFoods implements Serializable {
    private Integer id;
    private Products products;
    private Foods foods;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Products getProducts() {
        return products;
    }
    public void setProducts(Products products) {
        this.products = products;
    }
    public Foods getFoods() {
        return foods;
    }
    public void setFoods(Foods foods) {
        this.foods = foods;
    }

}
