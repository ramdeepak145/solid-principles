package com.solid;
import java.util.ArrayList;
public class User implements UserOps {

    ArrayList<Userdetails> list=new ArrayList<>();
    @Override
    public boolean login(Userdetails data) {
        // Login details fetching from the database checking they are valid or not
        if(data.getUsername().equals("ram") && data.getPassword().equals("1234")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean register(Userdetails data) {
        // if (email is valid) then storing into DB
        list.add(data);
        return true;
    }
}
