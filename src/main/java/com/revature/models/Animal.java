package com.revature.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name="animals")
@Component
public class Animal {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int animalId;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private int age;

    @Column(nullable=false)
    private String department;

    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
    @JoinColumn(name="keeperId", nullable=false)
    private Keeper keeper;

    public Animal() {
    }

    public Animal(int animalId, String name, int age, String department, Keeper keeper) {
        this.animalId = animalId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.keeper = keeper;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Keeper getKeeper() {
        return keeper;
    }

    public void setKeeper(Keeper keeper) {
        this.keeper = keeper;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", keeper=" + keeper +
                '}';
    }
}
