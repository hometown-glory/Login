package com.xxx.entity;

/**
 * @author 言云月
 * @data 2022/9/20 13:15
 */
public class User {
    private Integer Id;
    private String username;
    private String userPwd;
    private Integer userAge;

    public User() {
    }

    public User(Integer id, String username, String userPwd, Integer userAge) {
        Id = id;
        this.username = username;
        this.userPwd = userPwd;
        this.userAge = userAge;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
