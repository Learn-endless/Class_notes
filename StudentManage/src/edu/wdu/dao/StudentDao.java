package edu.wdu.dao;

import edu.wdu.pojo.Student;
import edu.wdu.pojo.Subject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 19:09
 */
public class StudentDao {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int idNumber = 0;

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(String name, String sex, String subjectIdStr){
        idNumber++;
        int subjectId = Integer.parseInt(subjectIdStr);
        ArrayList<Subject> subjects = SubjectDao.getSubjects();
        Subject subject = null;
        for(Subject n : subjects){
            if(n.getId() == subjectId){
                subject = n;
                break;
            }
        }
        Student student = new Student(idNumber,name,sex,subject);
        students.add(student);
    }

    public static Student getId(String idStr){
        int id = Integer.parseInt(idStr);
        Student student = null;
        for(Student stu : students){
            if(stu.getId() == id){
                student = stu;
                break;
            }
        }
        return student;
    }

    public static void updateStudent(String idStr, String name, String sex, String subjectIdStr){
        Student student = getId(idStr);
        Subject subject = SubjectDao.getId(subjectIdStr);

        student.setName(name);
        student.setSex(sex);
        student.setSubject(subject);
    }

    public static void deletStudent(String idStr){
        Student student = getId(idStr);
        students.remove(student);
    }
}
