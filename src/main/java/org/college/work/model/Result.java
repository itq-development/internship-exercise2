package org.college.work.model;

/**
 * Created by byaxe on 6/27/16.
 */
public class Result {

    private Long studentId;
    private Long examId;
    private Integer mark;
    private Boolean visited;

    public Result() {
    }

    public Result(Long studentId, Long examId, Integer mark, Boolean visited) {
        this.studentId = studentId;
        this.examId = examId;
        this.mark = mark;
        this.visited = visited;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Boolean isVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }
}
