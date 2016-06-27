package org.college.work.model;

/**
 * Created by byaxe on 6/27/16.
 */
public class TeacherStudent {

    private Long teacherId;
    private Long studentId;

    public TeacherStudent() {
    }

    public TeacherStudent(Long teacherId, Long studentId) {
        this.teacherId = teacherId;
        this.studentId = studentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
