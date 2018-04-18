package com.liyuan.designpattern.factory.abstrctfactory;


public class SendSmsFactory implements Provider{

    public Sender produce(){
        return new SmsSender ();
    }

}
