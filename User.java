package com.solidprinciples;
import java.util.ArrayList;
public class User implements UserLogin{

    ArrayList<UserDetails> list=new ArrayList<>();
    @Override
    public boolean login(UserDetails data) {

        if(data.getUserName().equals("ram") && data.getPassword().equals("1234")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean register(UserDetails data) {
        list.add(data);
        return true;
    }
}
