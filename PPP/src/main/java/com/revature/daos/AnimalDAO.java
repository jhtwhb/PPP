package com.revature.daos;

import com.revature.models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalDAO extends JpaRepository<Animal, Integer> {
    public Animal findById(int id);
}
