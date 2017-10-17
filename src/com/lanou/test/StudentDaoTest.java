package com.lanou.test;

import com.lanou.dao.StudentDao;
import com.lanou.dao.impl.StudentDaoImpl;
import com.lanou.domain.Student;
import org.junit.Test;

/**
 * Created by dllo on 17/10/17.
 */
public class StudentDaoTest {

    @Test
    public void save(){
//        创建一个 dao层 的对象
        StudentDao dao = new StudentDaoImpl();

//        创建要保存的对象
        Student student = new Student("小光", "女", 24);

        System.out.println("保存前: " + student);

        student = dao.save(student);    // 保存对象

        System.out.println("保存后: " + student);

    }
}
