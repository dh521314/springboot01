package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Users {
    @Id
    @Column
    private Integer userid;
    @Column
    private String uname;
    @Column
    private String password;
    @Column
    private String phone;

    public Users() {
    }

    public Users(Integer userid, String uname, String password, String phone) {
        this.userid = userid;
        this.uname = uname;
        this.password = password;
        this.phone = phone;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
