package com.liyuan.designpattern.builder.builder3;


public interface Builder {

    public void bulidStaple();
    public void bulidNonStaple();
    public void bulidDrinks();
    
    public Package getPackage();
}
