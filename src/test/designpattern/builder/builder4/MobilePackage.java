package com.liyuan.designpattern.builder.builder4;


public class MobilePackage {

    private String liuliang;
    private String time;
    
    public String getLiuliang(){
        return liuliang;
    }
    
    public void setLiuliang(String liuliang){
        this.liuliang = liuliang;
    }
    
    public String getTime(){
        return time;
    }
    
    public void setTime(String time){
        this.time = time;
    }

    @Override
    public String toString(){
       return "liuliang: "+liuliang+" ,time:"+time;
    }
    
    
}
