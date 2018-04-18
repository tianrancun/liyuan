package com.liyuan.designpattern.builder.mail.sender;


public class GoodbyeBuilder extends Builder {

    GoodbyeBuilder(){
        msg = new GoodbyeMessage ();
    }
    @Override
    public void bulidSubject(){
        msg.setSubject ("good bye");
        
    }
    
    @Override
    public void buildFrom(String from){
        msg.setFrom (from);
        
    }

    @Override
    public void buildTo(String to){
        msg.setTo (to);
        
    }

    @Override
    public void buildDate(){
        msg.setDate ("2018-04-02");
        
    }

   

}
