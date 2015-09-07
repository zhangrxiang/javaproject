package com.zrx.service;

import com.zrx.domain.Student;
import com.zrx.util.DatabaseUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2015/9/5.
 */
public class StudentService {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private List<Student> students;

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        List<Student> students = studentService.findStudent();
        System.out.println(students.size());
        for (Student student : students){
            System.out.println(student);
        }
    }

    public List<Student> findStudent() {
        connection = DatabaseUtil.getConnection();
        try {
            statement = connection.createStatement();
            String sql = "SELECT * FROM \"mydb\".\"t_student\"";
            resultSet = statement.executeQuery(sql);
            return createStudent(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Student> createStudent(ResultSet resultSet) {
        Student student = null;
        students = new ArrayList<Student>();
        try {
            while (resultSet.next()) {//  while (resultSet!=null 则显示结果集已耗尽
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                student = new Student(id, name, age);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
