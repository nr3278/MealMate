package bean;

import java.io.Serializable;

public class MemberAccount implements Serializable {
    private String id;
    private String name;
    private String email;
    private String password;
    // DateTime型どこ?
//    private DateTime lastLogin;
    private Integer languageId;
//    private DateTime passwordUpdated;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getLanguageId() {
        return languageId;
    }
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
