package com.solidprinciples;

public abstract class SubscriptionPlans{
    private int subscriptionId;
    private String subscriptionDetails;


    public SubscriptionPlans(int subscriptionId, String subscriptionDetails)
    {
        this.subscriptionId=subscriptionId;
        this.subscriptionDetails=subscriptionDetails;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionDetails() {
        return subscriptionDetails;
    }

    public void setSubscriptionDetails(String subscriptionDetails) {
        this.subscriptionDetails = subscriptionDetails;
    }

    public abstract int getSubscriptionPrice();
}
