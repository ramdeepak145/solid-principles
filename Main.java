package com.solidprinciples;

public class Main {

    public static void main(String[] args) {

        User userobj=new User();
        UserDetails data=new UserDetails();
        userobj.register(new UserDetails("ram.deepak@gmail.com","ram","1234","8179967489"));
        if(userobj.login(new UserDetails("ram","1234"))) {
            System.out.println("Login successfull");
        }
        else
        {
            System.out.println("Login failed");
        }
        MailService mail=new MailService();
        System.out.println("Sending Mail from User Id:"+mail.sendMail(data));
        Order orderobj=new OrderHistory();
        OrderHistory historyobj=new OrderHistory();
        historyobj.custOrder(orderobj);
        historyobj.custOrder(orderobj);
        System.out.println(historyobj.custOrder(orderobj));
        System.out.println(orderobj.orderQuantity());
        Invoice invoiceobj=new Invoice(historyobj);
        System.out.println("Orderlist Bill is  : "+invoiceobj.bill());
        SubscriptionPlans plan=new FiveYearSubscription(18733145,"Fiveyearsplan");
        System.out.println("User's Subscription price: "+plan.getSubscriptionPrice());
    }
}