package com.liyuan.designpattern.builder.mail.sender;


public  class AutoMessage {
    public String subject;
    public String from;
    public String to;
    public String date;
    
    public void send(){
        System.out.println ("main send..");
    }

    
    public void setSubject(String subject){
        this.subject = subject;
    }

    
    public void setFrom(String from){
        this.from = from;
    }

    
    public void setTo(String to){
        this.to = to;
    }

    
    public void setDate(String date){
        this.date = date;
    }
    
    
}
