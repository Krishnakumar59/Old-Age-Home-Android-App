package com.singledeveloper.old_parentonlinecare;

public class model {

    String name, age, gender,contact, address, purl;

    model(){

    }


    public model(String name, String age, String gender, String contact, String address, String purl) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.address = address;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurl() {
        return purl;
    }


    public void setPurl(String purl) {
        this.purl = purl;
    }

    public model(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}