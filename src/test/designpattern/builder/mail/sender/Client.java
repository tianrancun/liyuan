package com.liyuan.designpattern.builder.mail.sender;


public class Client {
   public static void main(String args[]){
       Builder gb = new GoodbyeBuilder ();
       
       Director director = new Director (gb);
       director.bulidMessage ("dj", "dd");
   } 
}
