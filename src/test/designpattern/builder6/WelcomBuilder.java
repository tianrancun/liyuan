package com.liyuan.designpattern.builder6;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 18:02:06
 */
public class WelcomBuilder extends Builder
{
    /**
     * 定义欢迎消息
     */
    private static final String subject = "Welcome to my zone!" ;

    /**
     * 构造子
     */
    public WelcomBuilder()
    {
       message = new WelcomeMessage();
      
    }

    /**
     * 主题零件的建造方法
     */
    public void buildSubject()
    {
        message.setSubject(subject);
    }

    /**
     * 内容零件的建造方法
     */
    public void buildBody()
    {
        message.setBody("Confratulation for making the right choice!");
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
