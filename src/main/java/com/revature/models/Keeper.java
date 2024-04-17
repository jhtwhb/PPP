package com.revature.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Entity
@Table(name="keepers")
@Component
public class Keeper {

    // Variables
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK auto-inc
    private int keeperId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    //Boilerplate code
    public Keeper() {
    }

    public Keeper(int keeperId, String name, int age) {
        this.keeperId = keeperId;
        this.name = name;
        this.age = age;
    }

    public int getKeeperId() {
        return keeperId;
    }

    public void setKeeperId(int keeperId) {
        this.keeperId = keeperId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Keeper{" +
                "keeperId=" + keeperId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}