package com.example.extremesoft.extrem.model;


import javax.persistence.*;

@MappedSuperclass
public class BaseModel {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "active_status", nullable = false, columnDefinition = "boolean default true")
    private  boolean activeStatus = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
