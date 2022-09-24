package com.nt.app.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseId;
    private String title;
    @OneToOne(cascade = { CascadeType.ALL }, mappedBy = "course")
    private CourseMaterial courseMaterial;
    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacherId")
    private Teacher teacher;
    
   
    
    public Course() {
    }
    
    public Course(final Long courseId, final String title, final CourseMaterial courseMaterial, final Teacher teacher) {
        this.courseId = courseId;
        this.title = title;
        this.courseMaterial = courseMaterial;
        this.teacher = teacher;
    }
}