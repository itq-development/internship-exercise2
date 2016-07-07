package org.college.work.model;


/**
 * Created by byaxe on 6/27/16.
 */
public class Teacher {

    private Long id;
    private String groupNumber;
    private String name;
    private Integer age;
    private String sex;
    private String education;

    public Teacher() {
    }

    public Teacher(Long id, String groupNumber, String name, Integer age, String sex, String education) {
        this.id = id;
        this.groupNumber = groupNumber;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
