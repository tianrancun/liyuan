package com.liyuan.designpattern.builder6;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 18:42:00
 */
public class Client
{
   // private static Builder builder;
    private static Director director;

    public static void main(String[] args)
    {
        WelcomBuilder builder = new WelcomBuilder();

        director = new Director(builder);
        director.construct("xiandaoyan@126.com","zaiqiang.su@gmail.com");
        
        Builder  builder2 = new GoodbyeBuilder();
        director = new Director(builder2);
        director.construct("xiandaoyan@126.com","zaiqiang.su@gmail.com");
    }
}
