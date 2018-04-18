package com.liyuan.designpattern.builder.builder5;



public class BuildDirector {
   private Builder b= new Concreatebuilder();
    
   public BMessage buildMessage(AMessage am){
     b.buildAMessage (am);
     return b.getBMessage ();
   }
}
