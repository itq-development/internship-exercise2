package by.novacom.exercise.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by byaxe on 4/5/16.
 */

@Entity
@Table(name = "employees")
public class EmployeesEntity extends AbstractEntity{

    private String name;
    private String position;
    private String sex;
    private int age;
    private Set<CompaniesEntity> companies = new HashSet<>();

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "employees")
    public Set<CompaniesEntity> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<CompaniesEntity> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "EmployeesEntity{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", companies=" + companies +
                '}';
    }
}
