package com.solid;

import java.util.ArrayList;

public class OrderHistory implements Order{
    ArrayList<String> list=new ArrayList<String>();
    public ArrayList<String>  custorder(String newitem)
    {
        list.add(newitem);
        return list;
    }
    public int orderquantity()
    {
        return list.size();
    }
}
