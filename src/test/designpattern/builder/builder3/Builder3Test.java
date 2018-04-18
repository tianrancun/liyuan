package com.liyuan.designpattern.builder.builder3;


public class Builder3Test {

    public static void main(String[] args){
        PackageDirector pd = new PackageDirector ();
        Builder builder = new Abulider ();
        Package pc=pd.packageBuild (builder);
        System.out.println (pc);
    }

}
