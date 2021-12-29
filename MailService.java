package com.solid;

public class MailService implements Email{

    @Override
    public void sendmail() {
        System.out.println("sending mail from user");
    }
}
