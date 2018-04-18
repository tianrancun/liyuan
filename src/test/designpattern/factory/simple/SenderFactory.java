package com.liyuan.designpattern.factory.simple;

public class SenderFactory  {
    public Sender produce(String type){
        if(type.equals ("SMS")){
            return new SmsSender ();
        }else if(type.equals ("EMail")){
            return new EmailSender ();
        }else{
            return null;
        }
    }
}
