package com.liyuan.designpattern.builder.builder3;


public class PackageDirector {
   
    public Package packageBuild(Builder b){
       b.bulidDrinks ();
       b.bulidNonStaple ();
       b.bulidStaple ();
        
      return b.getPackage ();
      
    }
    
}
