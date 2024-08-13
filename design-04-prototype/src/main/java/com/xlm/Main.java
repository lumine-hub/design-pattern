package com.xlm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author xlm
 * 2024/8/13 下午2:09
 * 原型需要注意：拷贝是浅拷贝，拷贝的是地址而不是数据。如test1所示
 * 如果要实现深拷贝，可以使用object流，如test2所示
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        test1();
        test2();
    }


    //深拷贝
    public static void test2() throws Exception {
        Student stu = new Student("张三", 18);
        Citation citation = new Citation("张三",stu);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(citation);
        objectOutputStream.close();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Citation citation1 = (Citation) objectInputStream.readObject();
        System.out.println(citation); //张三
        System.out.println(citation1);//张三
        citation1.getStudent().setName("李四");
        System.out.println(citation);//张三
        System.out.println(citation1);//李四
    }
    //浅拷贝
    public static void test1() throws Exception {
        Student stu = new Student("张三", 18);
        Citation citation = new Citation("张三",stu);

        Citation citation1 = citation.clone();
//        citation1.setStudent(new Student("李四", 18));
        stu.setName("李四");
        citation1.setStudent(stu);
        System.out.println(citation);
        System.out.println(citation1);
    }
}