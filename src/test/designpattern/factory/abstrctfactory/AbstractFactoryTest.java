package com.liyuan.designpattern.factory.abstrctfactory;

public class AbstractFactoryTest {

    public static void main(String[] args){
       Provider smsSender = new SendMailFactory ();
       smsSender.produce ().send ();
    }
}
