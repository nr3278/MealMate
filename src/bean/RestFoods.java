package bean;

import java.io.Serializable;

public class RestFoods implements Serializable {
    private Integer id;
    private MemberAccounts memberAccounts;
    private Foods foods;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public MemberAccounts getMemberAccounts() {
        return memberAccounts;
    }
    public void setMemberAccounts(MemberAccounts memberAccounts) {
        this.memberAccounts = memberAccounts;
    }
    public Foods getFoods() {
        return foods;
    }
    public void setFoods(Foods foods) {
        this.foods = foods;
    }

}
