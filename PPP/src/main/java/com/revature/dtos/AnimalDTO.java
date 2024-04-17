package com.revature.dtos;

import com.revature.models.Keeper;

public class AnimalDTO {
    private int animalId, age, keeperId;
    private String name, department;

    public AnimalDTO() {
    }

    public AnimalDTO(int animalId, int age, int keeperId, String name, String department) {
        this.animalId = animalId;
        this.age = age;
        this.keeperId = keeperId;
        this.name = name;
        this.department = department;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getKeeperId() {
        return keeperId;
    }

    public void setKeeperId(int keeperId) {
        this.keeperId = keeperId;
    }

    @Override
    public String toString() {
        return "AnimalDTO{" +
                "animalId=" + animalId +
                ", age=" + age +
                ", keeperId=" + keeperId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
