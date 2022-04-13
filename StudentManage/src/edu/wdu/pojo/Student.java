package edu.wdu.pojo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 19:05
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private Subject subject;

    public Student() {
    }

    public Student(int id, String name, String sex, Subject subject) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
