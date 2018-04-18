package com.liyuan.designpattern.builder6;

/*import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.AddressException;*/
import java.util.Date;
import java.util.Properties;
import java.io.UnsupportedEncodingException;

/**
 * 类的功能说明如下：
 *
 * @author <a href="mailto:zaiqiang.su@gmail.com">SUZAIQIANG</a>
 * @version 1.0
 *          User: 设计人员
 *          Date: 2010-5-25
 *          Time: 17:21:56
 */
abstract public class AutoMessage
{
    protected String subject = "";
    protected String body = "";
    protected String from = "";
    protected String to = "";
    protected Date sendDate;

    public AutoMessage()
    {

    }

    public void send()
    {
      /*  //你的SMTP服务器地址
        String smtpHost = "smtp.gmail.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getDefaultInstance(properties, null);

        try
        {
            InternetAddress[] addresses = {new InternetAddress(to)};
            MimeMessage message;
            
            message = new MimeMessage(session);
            //建造发件人位元址零件
            message.setFrom(new InternetAddress(from,"zaiqiang.su"));
            //建造收件人位元址零件
            message.setRecipients(Message.RecipientType.TO, addresses);
            //建造主题零件
            message.setSubject(subject);
            //建造发送时间零件
            message.setSentDate(sendDate);
            //建造内容零件
            message.setText("Hello, I'm Suzaiqiang!\nHow are you?");

            //发送邮件，相当于产品返还方法
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", from, "lizaiyan1106");
            message.saveChanges();
            transport.sendMessage(message,message.getAllRecipients());
            transport.close();
            System.out.println("Email has been sent!");
        } catch (AddressException e)
        {
            e.printStackTrace();
        } catch (MessagingException e)
        {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }*/
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getTo()
    {
        return to;
    }

    public void setTo(String to)
    {
        this.to = to;
    }

    public Date getSendDate()
    {
        return sendDate;
    }

    public void setSendDate(Date sendDate)
    {
        this.sendDate = sendDate;
    }
}
