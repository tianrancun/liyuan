package com.liyuan.designpattern.factory.simple2;


public class SenderFactroyTest {

    public static void main(String[] args){
        SenderFactory factory = new SenderFactory ();
        factory.SmsProduce ().send ();
        factory.EmailProduce ().send ();
    }

}
