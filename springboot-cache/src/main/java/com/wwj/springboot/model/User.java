package com.wwj.springboot.model;

/**
 * @author weiwenjun
 * @since 2018/11/1
 */
public class User {


    private String name;
    private String address;
    private String tel;
    private Integer age;

    public User(String name, String address, String tel, Integer age) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}