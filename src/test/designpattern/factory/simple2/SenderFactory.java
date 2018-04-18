package com.liyuan.designpattern.factory.simple2;

public class SenderFactory  {
    public Sender SmsProduce(){
        return new SmsSender ();
    }
    
    public Sender EmailProduce(){
        return new EmailSender ();
    }
    
}
