package com.solidprinciples;

public class FiveYearSubscription extends SubscriptionPlans{


    public FiveYearSubscription(int subscriptionId, String subscriptionDetails)
    {
        super(subscriptionId, subscriptionDetails);
    }
    //Follows Open/Closed principle (discount is open for extension,Closed for modifications)
    public int discount()
    {
        return 15;
    }
    //Follows Liskov Substution principle(this can be replaced with parent class & follows "IS A" relationship)
    public int getSubscriptionPrice()
    {
        return 15000-(15000*discount()/100);
    }
}