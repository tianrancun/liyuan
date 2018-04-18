package com.liyuan.designpattern.builder.builder2;


public class ChinaStyleHouseBuilderImpl implements IHouseBuilder{

    public House house = new ChinaStyleHouse();
    
    @Override
    public void buildDoor() {
        house.setDoor("中式风格房门");
    }

    @Override
    public void buildFloor() {
        house.setFloor("中式风格地板");
    }

    @Override
    public void buildWall() {
        house.setWall("中式风格墙壁");
    }

    @Override
    public void buildWindows() {
        house.setWindows("中式风格门窗");
    }
    
    public void bulidPool(){
        house.setWindows("中式风pool");
    }
    
   @Override
    public House getHouse() {
        return house;
    }
   
   

}
