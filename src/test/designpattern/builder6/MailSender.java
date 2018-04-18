package com.liyuan.designpattern.builder6;

/*import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;*/
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
 *          Time: 15:31:02
 */
public class MailSender
{
  //  private static MimeMessage message;

    public static void main(String[] args)
    {
       /* //你的SMTP服务器地址
        String smtpHost = "smtp.gmail.com";
        //发送者地址
        String from = "zaiqiang.su@gmail.com";
        //收信人地址
        String to = "xiandaoyan@126.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getDefaultInstance(properties, null);

        try
        {
            InternetAddress[] addresses = {new InternetAddress(to)};
            message = new MimeMessage(session);
            //建造发件人位元址零件
            message.setFrom(new InternetAddress(from,"zaiqiang.su"));
            //建造收件人位元址零件
            message.setRecipients(Message.RecipientType.TO, addresses);
            //建造主题零件
            message.setSubject("Hello from Suzaiqiang");
            //建造发送时间零件
            message.setSentDate(new Date());
            //建造内容零件
            message.setText("Hello, I'm Suzaiqiang!\nHow are you?");

            //发送邮件，相当于产品返还方法
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", "zaiqiang.su@gmail.com", "lizaiyan1106");
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
}
