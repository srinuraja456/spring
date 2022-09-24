package com.nt.app.entity;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long teacherId;
    private String name;
    
   
    public Teacher() {
    }
    
    public Teacher(final long teacherId, final String name) {
        this.teacherId = teacherId;
        this.name = name;
    }
}