package com.liyuan.designpattern.builder.builder4;


public class PackageDirector {

    public MobilePackage pickMobilePackage(Builder b){
      
       return b.getPackage ();
    }
}
