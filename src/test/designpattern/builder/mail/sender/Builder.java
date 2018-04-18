package com.liyuan.designpattern.builder.mail.sender;


abstract class  Builder {

    AutoMessage msg;
    
    public abstract void bulidSubject();
    public abstract  void buildFrom(String from);
    public abstract void buildTo(String to);
    public abstract void buildDate();
    
    public void sendMail(){
        System.out.println ("mail send...");
    };
}
