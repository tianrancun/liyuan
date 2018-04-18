package com.liyuan.designpattern.builder.builder2;


public class BritishStyleHouseBuilderImpl implements IHouseBuilder {
    
public House house = new BritishStyleHouse(); 
    
    @Override
    public void buildDoor() {
        house.setDoor("英式风格门");
    }

    @Override
    public void buildFloor() {
        house.setFloor("英式风格地板");
    }

    @Override
    public void buildWall() {
        house.setWall("英式风格地板");
    }

    @Override
    public void buildWindows() {
        house.setWindows("英式风格窗户");
    }

    @Override
    public House getHouse() {
        return house;
    }

}
