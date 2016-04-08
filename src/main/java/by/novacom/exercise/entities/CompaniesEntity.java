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
    private CompaniesEntity parent;
    private Set<CompaniesEntity> children = new HashSet<>();

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

    @ManyToOne(targetEntity = CompaniesEntity.class)
    @JoinColumn(name = "parent")
    public CompaniesEntity getParent() {
        return parent;
    }

    public void setParent(CompaniesEntity parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy = "parent")
    public Set<CompaniesEntity> getChildren() {
        return children;
    }

    public void setChildren(Set<CompaniesEntity> children) {
        this.children = children;
    }
}
