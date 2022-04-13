package edu.wdu.dao;

import edu.wdu.pojo.Subject;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 16:13
 */
public class SubjectDao {
    private static ArrayList<Subject> subjects = new ArrayList<>();
    private static int subNumber = 0;

    /**
     * 获取课程列表
     * @return  课程列表
     */
    public static ArrayList<Subject> getSubjects(){
        return subjects;
    }

    /**
     * 添加课程
     * @param name 课程名
     * @param creditStr  学分
     */
    public static void addSubject(String name, String creditStr){
        int credit = Integer.parseInt(creditStr);
        subNumber++;
        Subject subject = new Subject(subNumber,name,credit);
        subjects.add(subject);
    }

    /**
     * 获取 id 值对应的 subject 对象
     * @param idStr id
     * @return   返回对象
     */
    public static Subject getId(String idStr){
        int id = Integer.parseInt(idStr);
        Subject result = null;
        for(Subject n:subjects){
            if(n.getId() == id){
                result = n;
                break;
            }
        }
        return result;
    }

    /**
     * 修改功能
     * @param idStr
     * @param name
     * @param creditStr
     */
    public static void updateSubject(String idStr, String name, String creditStr){
        int id = Integer.parseInt(idStr);
        int credit = Integer.parseInt(creditStr);
        for(Subject n : subjects){
            if(n.getId() == id){
                n.setName(name);
                n.setCredit(credit);
                break;
            }
        }
    }

    /**
     * 删除功能
     * @param idStr
     */
    public static void deletSubject(String idStr){
        int id = Integer.parseInt(idStr);
        for(Subject n : subjects){
            if(n.getId() == id){
                subjects.remove(n);
                break;
            }
        }
    }
}
