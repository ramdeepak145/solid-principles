package com.solidprinciples;

//Follows Single Responsibility principle by taking only login process as a responsibility
public interface UserLogin
{
    boolean login(UserDetails data);
    boolean register(UserDetails data);
}

