package com.solid;

public class Main {

    public static void main(String[] args) {
	    AmazonCustomer obj=new AmazonCustomer();
        obj.setcustname("ram");
        System.out.println("customer name is  : "+obj.getcustname());
        User userobj=new User();
        userobj.register(new Userdetails("ram.deepak@gmail.com","ram","1234","8179967489"));
        if(userobj.login(new Userdetails("ram","1234"))) {
            System.out.println("Login successfull");
        }
        else
        {
            System.out.println("Login failed");

        }
        OrderHistory obj2=new OrderHistory();
        obj2.custorder("books");
        obj2.custorder("rice");
        System.out.println(obj2.custorder("laptop"));
        System.out.println(obj2.orderquantity());
        Invoice obj3=new Invoice(obj2);
        System.out.println("Orderlist Bill is  : "+obj3.Bill());
    }
}