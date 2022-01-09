package com.solidprinciples;

public class MailService implements Email{

    @Override
    public String sendMail(UserDetails data)
    {
        data.setEmail("ram.deepak@gmail.com");
        return data.getEmail();
    }
}
