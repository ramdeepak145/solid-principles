package com.solidprinciples;

public class OneYearSubscription extends SubscriptionPlans{

    public OneYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }

    public int getsubscriptionPrice()
    {
        return 10000;
    }

}
