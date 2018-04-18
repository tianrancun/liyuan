package com.liyuan.designpattern.builder.builder2;

//http://blog.chinaunix.net/uid-29140694-id-4105980.html
public class BuilderTest {

    public static void main(String[] args){
        HouseDirector director = new HouseDirector ();
       
        IHouseBuilder builder =new ChinaStyleHouseBuilderImpl  ();
       
       House chouse= director.buildHouse ( builder);
        
        System.out.println("------------------------------");
        System.out.println("房门属性：" + chouse.getDoor());
        System.out.println("墙壁属性：" + chouse.getWall());
        System.out.println("天花板属性：" + chouse.getFloor());
        System.out.println("窗户属性：" + chouse.getWindows());
       
        System.out.println("------------------------------");
        IHouseBuilder ebuilder = new BritishStyleHouseBuilderImpl();
        House ehouse = new HouseDirector().buildHouse(ebuilder);
        System.out.println("房门属性：" + ehouse.getDoor());
        System.out.println("墙壁属性：" + ehouse.getWall());
        System.out.println("天花板属性：" + ehouse.getFloor());
        System.out.println("窗户属性：" + ehouse.getWindows());
        System.out.println("------------------------------");
    }

}
