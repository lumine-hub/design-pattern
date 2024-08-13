package com.xlm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xlm
 * 2024/8/13 下午2:44
 *
 */
@Data
public class Citation implements Cloneable, Serializable {

    private String name;
    private Student student;

    public Citation(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学在2024学年荣获“优秀学生”称号");
    }

    @Override // 深拷贝
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

//    @Override // 浅拷贝
//    protected Citation clone() throws CloneNotSupportedException {
//        return (Citation) super.clone();
//    }
}
