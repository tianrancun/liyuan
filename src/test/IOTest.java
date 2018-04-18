package com.liyuan;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class IOTest {

 
    @Test
    public void fixtest() throws IOException{
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream(new File("D:\\a1.txt"));
            fos = new FileOutputStream(new File("D:\\a2.txt"));
            int ch;
            while((ch=fis.read()) != -1){
                System.out.println((char)ch);
                fos.write(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != fos){
                fos.close();
            }
            if(null != fis){
                fis.close();
            }
        }
    }
    @Test
    public void fixtest2() throws IOException{
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream(new File("D:\\a1.txt"));
            fos = new FileOutputStream(new File("D:\\a2.txt"));
         
            byte[] b= new byte[1024];
            int hasRead;
            while((hasRead=fis.read (b))>0){
                fos.write (b, 0, hasRead);
            }
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != fos){
                fos.close();
            }
            if(null != fis){
                fis.close();
            }
        }
    }
    @Test
    public void fixtest3() throws IOException{
        /**
         * 1.先将文件中的内容读入到缓冲输入流中
         * 2.将输入流中的数据通过缓冲输出流写入到目标文件中
         * 3.关闭输入流和输出流
         */
        try {
            long begin=System.currentTimeMillis();
            FileInputStream fis=new FileInputStream("D:\\a1.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);

            FileOutputStream fos=new FileOutputStream("D:\\a2.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);

            int size=0;
            byte[] buffer=new byte[10240];
            while((size=bis.read(buffer))!=-1){
                bos.write(buffer, 0, size);
            }
            //刷新此缓冲的输出流，保证数据全部都能写出
            bos.flush();
            bis.close();
            bos.close();
            long end=System.currentTimeMillis();
            System.out.println("使用缓冲输出流和缓冲输入流实现文件的复制完毕！耗时："+(end-begin)+"毫秒");
        } catch (Exception e) {
                e.printStackTrace();
        }
    }

    @Test
    public void fixtest4() throws IOException{
      
                // 在try() 中打开的文件， JVM会自动关闭
            FileReader fr = new FileReader(new File ("D:\\a1.txt")) ;
            char[] buf = new char[16];
            int hasRead = 0;
            // 每个char都占两个字节，每个字符或者汉字都是占2个字节，因此无论buf长度为多少，总是能读取中文字符长度的整数倍,不会乱码
            while ((hasRead = fr.read(buf)) > 0) {
                // 如果buf的长度大于文件每行的长度，就可以完整输出每行，否则会断行。
                // 循环次数 = 文件字符数 除以 buf长度
                System.out.println(new String(buf, 0, hasRead));
                // 跟上面效果一样
                // System.out.println(buf);
            }
         
    }
    
    /**
     *@Title:  FileInputStream类的使用
     *@Description: 读取文件内容
     */
    @Test
    public void testRead(){
        FileInputStream fis = null ;
        try {
             fis = new FileInputStream ("D:\\a1.txt");
           
            byte[] b = new byte[1024];
            int hasRead;//已读到的数据
                while ((hasRead=fis.read (b))>0) {
                 System.out.println (new String (b, 0, hasRead) );
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close ();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } 
            }
        }
    }
    
    
    @Test
    public void fixWrite(){
        FileOutputStream fos = null ;
        try {
            fos  = new FileOutputStream("D:\\a2.txt");
            String content="今天撸农药又被小学生坑了";
            byte[] array = content.getBytes() ;//String convert to byte array
            fos.write( array );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
