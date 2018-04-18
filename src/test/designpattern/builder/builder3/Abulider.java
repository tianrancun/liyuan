package com.liyuan.designpattern.builder.builder3;

public class Abulider implements Builder{

    private Package pg =new APackage ();
    
    @Override
    public void bulidStaple(){
        pg.setStaple ("A主食");
        
    }

    @Override
    public void bulidNonStaple(){
        pg.setNotStaple  ("A副食");
        
    }

    @Override
    public void bulidDrinks(){
        pg.setDrinks  ("A饮料");
        
    }

    @Override
    public Package getPackage(){
        return pg;
    }

    

}
