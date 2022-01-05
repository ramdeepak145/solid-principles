package com.solidprinciples;

public class Main {

    public static void main(String[] args) {
	    AmazonCustomer obj=new AmazonCustomer();
        obj.setCustName("ram");
        System.out.println("customer name is  : "+obj.getCustName());
        User userobj=new User();
        userobj.register(new UserDetails("ram.deepak@gmail.com","ram","1234","8179967489"));
        if(userobj.login(new UserDetails("ram","1234"))) {
            System.out.println("Login successfull");
        }
        else
        {
            System.out.println("Login failed");
        }
        Order orderobj=new OrderHistory();
        OrderHistory historyobj=new OrderHistory();
        historyobj.custOrder(orderobj);
        historyobj.custOrder(orderobj);
        System.out.println(historyobj.custOrder(orderobj));
        System.out.println(orderobj.orderQuantity());
        Invoice invoiceobj=new Invoice(historyobj);
        System.out.println("Orderlist Bill is  : "+invoiceobj.bill());
        SubscriptionPlans plan=new FiveYearSubscription(18733145,"Fiveyearsplan");
        System.out.println("User's Subscription price: "+plan.getsubscriptionPrice());
    }
}