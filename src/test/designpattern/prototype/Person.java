package com.liyuan.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Person implements Cloneable {
    private int age ;  
    private String name;  
      
    public Person(int age, String name) {  
        this.age = age;  
        this.name = name;  
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException  {  
        Person proto = (Person) super.clone();  
        return proto;  
    } 
    
    public Object DeepClone() throws IOException, ClassNotFoundException{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 从流内读出对象
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(
            bos.toByteArray()));
        return ois.readObject();
    }
    
    
    public int getAge(){
        return age;
    }

    
    public void setAge(int age){
        this.age = age;
    }

    
    public String getName(){
        return name;
    }

    
    public void setName(String name){
        this.name = name;
    } 
    
    
}
