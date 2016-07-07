package org.college.work.model;

/**
 * Created by byaxe on 6/27/16.
 */
public class Group {

    private Long id;
    private String number;

    public Group() {
    }

    public Group(Long id, String number) {
        this.id = id;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
