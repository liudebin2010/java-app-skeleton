package com.v51das.app.cassandra.reactive.service;


import com.v51das.app.cassandra.reactive.model.Student;
import com.v51das.app.cassandra.reactive.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * student的操作
 */
@Service
public class StudentService {
    /**
     * 注入持久层
     */
    @Autowired
    private StudentRepository repository;


    /**
     * 查询所有信息
     * @return
     */
    public List<Student> queryAllStudent(){
        List<Student> studentList = repository.findAll();
        return studentList;
    }

    /**
     * 根据id 查询一条信息
     * @param id
     * @return
     */
    public Student queryOneStudent(Long id){
        return repository.findById(id).get();
    }

    /**
     * 保存数据
     */

    public void saveStudent(Student student){
        repository.save(student);
    }

    /**
     * 修改数据
     */
    public void updateStudent(){
        Student student = this.queryOneStudent(1019L);
        student.setGender(0);
        repository.save(student);
    }

    /**
     * 删除数据
     */
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
}