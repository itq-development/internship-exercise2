package org.college.work.model;

import java.util.Date;

/**
 * Created by byaxe on 6/27/16.
 */
public class Exam {

    private Long id;
    private String title;
    private Date scheduledDate;
    private Long cabinet;
    private String status;
    private Long group;
    private Long teacher;

    public Exam() {
    }

    public Exam(Long id, String title, Date scheduledDate, Long cabinet, String status, Long group, Long teacher) {
        this.id = id;
        this.title = title;
        this.scheduledDate = scheduledDate;
        this.cabinet = cabinet;
        this.status = status;
        this.group = group;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Long getCabinet() {
        return cabinet;
    }

    public void setCabinet(Long cabinet) {
        this.cabinet = cabinet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    public Long getTeacher() {
        return teacher;
    }

    public void setTeacher(Long teacher) {
        this.teacher = teacher;
    }
}
