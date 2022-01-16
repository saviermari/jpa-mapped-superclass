package com.smari.inheritance.enitity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "person")
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = true)
    private Integer age;

    @Column(name = "sex", nullable = true)
    private String sex;

    @Column(name = "CREATED_BY", updatable = false)
    private String createdBy;

    @CreationTimestamp
    @Column(name = "CREATED_TIME", updatable = false)
    private Timestamp createdTime;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @UpdateTimestamp
    @Column(name = "UPDATED_TIME")
    private Timestamp updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }
}