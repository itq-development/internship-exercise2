package by.novacom.exercise.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by byaxe on 4/5/16.
 */
@Entity
@Table(name = "companies")
public class CompaniesEntity extends AbstractEntity implements Serializable {

    private String title;
    private String slogan;
    private Set<EmployeesEntity> employees = new HashSet<>();
    private Set<CompaniesEntity> companies = new HashSet<>();

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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "companies", cascade = CascadeType.REMOVE)
    public Set<CompaniesEntity> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<CompaniesEntity> companies) {
        this.companies = companies;
    }
}
