package com.liyuan.designpattern.builder6;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 18:13:33
 */
public class GoodbyeBuilder extends Builder
{
    private static final String subject = "Thank you for being with us!" ;

    public GoodbyeBuilder()
    {
        message = new GoodbyeMessage();
    }

    public void buildSubject()
    {
        message.setSubject(subject);
    }

    public void buildBody()
    {
        message.setBody(" Oops! You have chosen to leave!");
    }

    /**
     * 邮件产品构造完成之后，用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public void sendMessage()
    {
        message.send();
    }
}
