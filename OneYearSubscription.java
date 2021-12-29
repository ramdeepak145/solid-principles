package com.solid;

public class OneYearSubscription extends Subscriptionplans{

    public OneYearSubscription(int pack_id, String pack_details) {
        super(pack_id, pack_details);
    }

    public void oneyearsubscriptiondetails()
    {
        System.out.println("this is a Amazon one year plan");
    }

    public int pack_price()
    {
        return 10000;
    }

}
