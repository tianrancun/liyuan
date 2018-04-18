package com.liyuan.designpattern.builder.mail.sender;


public class Director {

    Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }
    public void bulidMessage(String from ,String to){
        builder.buildDate ();
        builder.buildFrom (from);
        builder.buildTo (to);
        builder.sendMail ();
    }
}
