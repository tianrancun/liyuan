package com.liyuan.designpattern.builder.builder2;


public interface IHouseBuilder {
    
    /**
     * 建造墙壁
     */
    public void buildWall();
    
    /**
     * 建造房门
     */
    public void buildDoor();
    
    /**
     * 建造地板
     */
    public void buildFloor();
    
    /**
     * 建造窗户
     * @return
     */
    public void buildWindows();
    
    /**
     * 返回创造完成的对象
     * @return
     */
    public House getHouse();
}
