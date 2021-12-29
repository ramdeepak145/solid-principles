package com.solid;

public class Userdetails{
    private String email,password,user_name,phonenumber;

    public Userdetails(String email,  String user_name,String password,String phonenumber) {
        this.email = email;
        this.password = password;
        this.user_name = user_name;
        this.phonenumber=phonenumber;
    }

    public Userdetails( String user_name,String password) {
        this.password = password;
        this.user_name = user_name;
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

    public String getUsername() {
        return user_name;
    }

    public void setUsername(String user_name) {
        this.user_name = user_name;
    }
    public String getphonenum()
    {
        return phonenumber;
    }
    public void setphonenum(String phonenumber)
    {
        this.phonenumber=phonenumber;
    }
}
