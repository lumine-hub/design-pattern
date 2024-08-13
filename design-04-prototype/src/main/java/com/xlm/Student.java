package com.xlm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xlm
 * 2024/8/13 下午3:12
 */
@Data
public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
