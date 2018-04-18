package com.liyuan.designpattern.builder6;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 17:30:19
 */
public class GoodbyeMessage extends AutoMessage
{
    /**
     * 构造子
     */
    public GoodbyeMessage()
    {
        System.out.println(" Enter Goodbye Message");
    }

    /**
     * 某个商业方法
     */
    public void sayGoodbye()
    {
        System.out.println(" Goodbye ");
    }
}
