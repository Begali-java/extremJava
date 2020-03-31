package com.example.extremesoft.extrem.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "users")
public class Users  extends BaseModel{

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="fullname")
    private String fullname;

    @Column(name="dateofbirth")
    private Date dateOfBirth;




}
