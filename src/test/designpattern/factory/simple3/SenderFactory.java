package com.liyuan.designpattern.factory.simple3;

public class SenderFactory  {
    public static Sender SmsProduce(){
        return new SmsSender ();
    }
    
    public static Sender EmailProduce(){
        return new EmailSender ();
    }
    
}
