package com.solid;

public abstract class Subscriptionplans{
    int pack_id;
    String pack_details;
    public Subscriptionplans(int pack_id, String pack_details)
    {
        this.pack_id=pack_id;
        this.pack_details=pack_details;
    }
    public abstract int pack_price();

}
