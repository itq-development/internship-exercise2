package by.novacom.exercise.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by byaxe on 4/5/16.
 */
@Entity
@Table(name = "companies")
public class CompaniesEntity extends AbstractEntity {

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

    @ManyToMany(fetch = FetchType.EAGER)
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

//    @Override
//    public String toString() {
//        return "CompaniesEntity{" +
//                "title='" + title + '\'' +
//                ", slogan='" + slogan + '\'' +
//                ", employees=" + employees +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CompaniesEntity)) return false;
//
//        CompaniesEntity that = (CompaniesEntity) o;
//
//        if (!getTitle().equals(that.getTitle())) return false;
//        if (getSlogan() != null ? !getSlogan().equals(that.getSlogan()) : that.getSlogan() != null) return false;
//        return getEmployees().equals(that.getEmployees());
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = getTitle().hashCode();
//        result = 31 * result + (getSlogan() != null ? getSlogan().hashCode() : 0);
//        result = 31 * result + getEmployees().hashCode();
//        return result;
//    }
}
