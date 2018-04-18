package com.liyuan.designpattern.builder.builder5;


public class AMessage {
    private String id;
    private String msg;
    
    AMessage(String id,String msg){
        this.id =id;
        this.msg=msg;
    }
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getMsg(){
        return msg;
    }
    
    public void setMsg(String msg){
        this.msg = msg;
    }
    
    
}
