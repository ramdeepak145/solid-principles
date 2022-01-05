package com.solidprinciples;

import java.util.Random;

public class Invoice{
    public OrderHistory order;
    Random ran=new Random();
    public Invoice(OrderHistory order)
    {
        this.order=order;
    }
    public Integer bill()
    {
        int total= ran.nextInt(1000) ;
        return total;
    }
}
