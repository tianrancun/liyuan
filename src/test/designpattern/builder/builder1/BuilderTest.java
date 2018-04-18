package com.liyuan.designpattern.builder.builder1;


public class BuilderTest {

    public static void main(String args[]){
        Builder builder = new Builder ();
        builder.produceMailSender (5);
        
    }
}
