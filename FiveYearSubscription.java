package com.solidprinciples;

public class FiveYearSubscription extends SubscriptionPlans{


    public FiveYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }

    public int discount()
    {
        return 10;
    }
    public int getsubscriptionPrice()
    {
        return 15000;
    }
}