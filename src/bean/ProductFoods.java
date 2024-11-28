package bean;

import java.io.Serializable;

public class ProductFoods implements Serializable {
    private Integer id;
    private String productId;
    private Integer foodsId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Integer getFoodsId() {
        return foodsId;
    }
    public void setFoodsId(Integer foodsId) {
        this.foodsId = foodsId;
    }
}
