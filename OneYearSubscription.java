package com.solidprinciples;

public class OneYearSubscription extends SubscriptionPlans{

    public OneYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }
    //Follows Liskov Substution principle(this can be replaced with parent class & follows "IS A"  relationship)
    public int getSubscriptionPrice()
    {
        return 10000;
    }
}
