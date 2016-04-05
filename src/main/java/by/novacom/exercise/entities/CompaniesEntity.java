package by.novacom.exercise.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by byaxe on 4/5/16.
 */
@Entity
@Table(name = "companies")
public class CompaniesEntity extends AbstractEntity{

    private String title;
    private String slogan;
    private Set<EmployeesEntity> employees = new HashSet<>();

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "slogan")
    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "companies_employees", joinColumns = {
            @JoinColumn(name = "company_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "employee_id")
    })
    public Set<EmployeesEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeesEntity> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "CompaniesEntity{" +
                "title='" + title + '\'' +
                ", slogan='" + slogan + '\'' +
                ", employees=" + employees +
                '}';
    }
}
