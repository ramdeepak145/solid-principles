package com.solidprinciples;

import java.util.ArrayList;

public class OrderHistory implements Order{
    ArrayList<Order> list=new ArrayList<Order>();
    //Follows Dependency Inversion(here lowlevel depends ,but not highlevel is depending & Follows "HAS A" relationship)
    public ArrayList<Order>  custOrder(Order newItem)
    {
        list.add(newItem);
        return list;
    }
    public int orderQuantity()
    {
        return list.size();
    }
}