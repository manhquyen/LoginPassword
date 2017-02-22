package com.example.mypc.manhquyen.hello;

/**
 * Created by MyPC on 06/02/2017.
 */

public class Restaurant {
    private String name="";
    private String address="";
    private String password="";
    public String getName() {
        return(name);
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getPassword() {return (password);}
    public void setPassword(String password){ this.password=password;}
    public String getAddress() {
        return(address);
    }
    public void setAddress(String address) {
        this.address=address;
    }
}
