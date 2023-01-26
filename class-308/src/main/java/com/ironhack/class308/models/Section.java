package com.ironhack.class308.models;

import jakarta.persistence.*;

@Entity
public class Section {
    @Id
    private String id;
    private Integer roomNumber;
    private String teacherName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_code")
    private Course course;

    public Section() {
    }

    public Section(String id,Integer roomNumber, String teacherName, Course course) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.teacherName = teacherName;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
