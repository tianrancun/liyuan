package com.liyuan.designpattern.builder.builder3;


public class Package {

    @Override
    public String toString(){
        
        return "staple:"+staple+" ,notStaple:"+notStaple+" ,drinks:"+drinks;
    }

    private String staple;//主食
    private String notStaple;
    private String drinks;
    
    public String getStaple(){
        return staple;
    }
    
    public void setStaple(String staple){
        this.staple = staple;
    }
    
    public String getNotStaple(){
        return notStaple;
    }
    
    public void setNotStaple(String notStaple){
        this.notStaple = notStaple;
    }
    
    public String getDrinks(){
        return drinks;
    }
    
    public void setDrinks(String drinks){
        this.drinks = drinks;
    }
    
    
    
}
