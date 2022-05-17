package com.example.demospringbooticc706.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String address;
}
