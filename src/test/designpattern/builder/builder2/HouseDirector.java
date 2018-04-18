package com.liyuan.designpattern.builder.builder2;


public class HouseDirector {

    public House buildHouse(IHouseBuilder builder){
        
        /**
         * 建造房门
         */
        builder.buildDoor();
        /**
         * 建造地板
         */
        builder.buildFloor();
        /**
         * 建造墙壁
         */
        builder.buildWall();
        /**
         * 建造窗户
         */
        builder.buildWindows();
        
        return builder.getHouse();
        
    }
}
