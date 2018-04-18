package com.liyuan.designpattern.builder.builder5;


public class Concreatebuilder implements Builder{

    BMessage bMessage = new BMessage ();
    
    @Override
    public void buildAMessage(AMessage am){
        bMessage.setId (am.getId ());
        bMessage.setMsg (am.getMsg ());
        bMessage.setCreateTime ("2018-04-02");
        bMessage.setLevel ("lever 5");
    }

    @Override
    public BMessage getBMessage(){
        return bMessage;
    }

}
