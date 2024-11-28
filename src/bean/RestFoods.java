package bean;

import java.io.Serializable;

public class RestFoods implements Serializable {
    private Integer id;
    private String userAccounts;
    private Integer foodId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserAccounts() {
        return userAccounts;
    }
    public void setUserAccounts(String userAccounts) {
        this.userAccounts = userAccounts;
    }
    public Integer getFoodId() {
        return foodId;
    }
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}
