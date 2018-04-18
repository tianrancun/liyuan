package com.liyuan.designpattern.builder6;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 18:24:48
 */
public class Director
{
    Builder builder;

    /**
     * 构造子
     */
    public Director(Builder builder)
    {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各零件建造方法
     * 
     */
    public void construct(String toAddr, String fromAddr)
    {
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildTo(toAddr);
        this.builder.buildFrom(fromAddr);
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
