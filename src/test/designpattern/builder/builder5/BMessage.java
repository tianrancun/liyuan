package com.liyuan.designpattern.builder.builder5;

public class BMessage {

    private String id;
    private String msg;
    private String level;
    private String createTime;
    
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
    
    public String getLevel(){
        return level;
    }
    
    public void setLevel(String level){
        this.level = level;
    }
    
    public String getCreateTime(){
        return createTime;
    }
    
    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }

    @Override
    public String toString(){
        
        return "id:"+id+" ,msg:"+msg+" ,createTime:"+createTime+" ,level"+level;
    }
    
    
}
