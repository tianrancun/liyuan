package com.liyuan.designpattern.builder.builder4;

public class ABuilder implements Builder {

   
    MobilePackage mp = new AMobilePackage () ;
    
    ABuilder(MobilePackage mmp){
        mp.setLiuliang (mmp.getLiuliang ());
        mp.setTime (mmp.getTime ());
        
    }
    @Override
    public void setLiuliang(String liuliang){
        mp.setLiuliang (liuliang);

    }

    @Override
    public void setTime(String time){
        mp.setTime (time);
    }

    @Override
    public MobilePackage getPackage(){
      
        return mp;
    }
    
   
    
    
}
