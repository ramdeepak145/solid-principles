package com.solidprinciples;

//Follows Interface Segregation here interface email depends on the method sendMail() it use.
public interface Email
{
    public String sendMail(UserDetails data);
}
