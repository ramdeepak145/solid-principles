package com.solidprinciples;

public class MailService implements Email{

    @Override
    public void sendMail()
    {
        System.out.println("sending mail from user");
    }
}
