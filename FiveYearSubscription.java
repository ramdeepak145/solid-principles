package com.solid;

public class FiveYearSubscription extends Subscriptionplans{


    public FiveYearSubscription(int pack_id, String pack_details) {
        super(pack_id, pack_details);
    }

    public void fiveyearsubscriptiondeatils()
    {
        System.out.println("this is a amazon five year plan");
    }
    public int pack_price()
    {
        return 15000;
    }

}