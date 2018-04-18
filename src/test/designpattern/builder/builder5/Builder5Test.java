package com.liyuan.designpattern.builder.builder5;

//https://www.cnblogs.com/yujiwei/p/6883244.html
public class Builder5Test {
    public static void main(String[] args){
        BuildDirector bd = new BuildDirector ();
        AMessage aMessage = new AMessage ("1","hallo");
      
        BMessage bMessage =bd.buildMessage (aMessage);
        System.out.println (bMessage);
    }
    
}
