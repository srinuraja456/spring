package com.nt.app.entity;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class CourseMaterial
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long courseMaterialId;
    private String url;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "course_Id", referencedColumnName = "courseId")
    private Course course;
    
    
    
    public CourseMaterial() {
    }
    
    public CourseMaterial(final Long courseMaterialId, final String url, final Course course) {
        this.courseMaterialId = courseMaterialId;
        this.url = url;
        this.course = course;
    }
}