package com.liyuan.designpattern.builder6;

import java.util.Date;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 17:37:43
 */
abstract public class Builder
{
    protected AutoMessage message;
    
    /**
     * 构造器
     */
    public Builder(){}

    /**
     * 主题零件的构造方法
     */
    public abstract void buildSubject();

    /**
     * 内容零件的构造方法
     */
    public abstract void buildBody();

    /**
     * 发件人零件的构造方法
     */
    public void buildFrom(String from)
    {
        message.setFrom(from);
    }

    /**
     * 收件人零件的构造方法
     */
    public void buildTo(String to)
    {
        message.setTo(to);
    }

    /**
     * 发送时间零件构造方法
     */
    public void buildSendDate()
    {
        message.setSendDate(new Date());
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
