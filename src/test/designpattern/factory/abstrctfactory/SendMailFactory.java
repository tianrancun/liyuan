package com.liyuan.designpattern.factory.abstrctfactory;

public class SendMailFactory  implements Provider {

    public Sender produce(){
        return new EmailSender ();
    }
}
