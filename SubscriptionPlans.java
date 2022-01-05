package com.solidprinciples;

public abstract class SubscriptionPlans{
    int subscriptionId;
    String subscriptionDetails;
    public SubscriptionPlans(int subscriptionId, String subscriptionDetails)
    {
        this.subscriptionId=subscriptionId;
        this.subscriptionDetails=subscriptionDetails;
    }
    public abstract int getsubscriptionPrice();

}
