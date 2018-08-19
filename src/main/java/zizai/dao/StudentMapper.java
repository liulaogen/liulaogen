package zizai.dao;

import java.util.List;

import zizai.model.Student;

public interface StudentMapper {

    //添加学生
    int insert(Student student);

    //根据id来删除学生
    int deleteByPrimaryKey(Integer id);

    //根据名字来查询学生信息
    List<Student> selectByName(String name);
    //根据Id来查询学生信息

    Student selectStudentByID(int id);

    //列出所有的学生
    List<Student> getAllStu();

    //修改学生信息
    int updateStu(Student student);

}