package com.liyuan.designpattern.factory.simple;


public class SenderFactroyTest {

    public static void main(String[] args){
        SenderFactory factory = new SenderFactory ();
        factory.produce ("SMS").send ();
        factory.produce ("EMail").send ();;

    }

}
