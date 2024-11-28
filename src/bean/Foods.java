package bean;

import java.io.Serializable;

public class Foods implements Serializable {
    private Integer id;
    private String foodName;
    private String iconR;
    private String iconG;
    private Integer categoryId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getIconR() {
        return iconR;
    }
    public void setIconR(String iconR) {
        this.iconR = iconR;
    }
    public String getIconG() {
        return iconG;
    }
    public void setIconG(String iconG) {
        this.iconG = iconG;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

}
