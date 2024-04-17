package com.revature.controllers;

import com.revature.daos.AnimalDAO;
import com.revature.daos.KeeperDAO;
import com.revature.dtos.AnimalDTO;
import com.revature.models.Animal;
import com.revature.models.Keeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    AnimalDAO animalDAO;
    KeeperDAO keeperDAO;

    @Autowired
    public AnimalController(AnimalDAO animalDAO, KeeperDAO keeperDAO) {
        this.animalDAO = animalDAO;
        this.keeperDAO = keeperDAO;
    }


    // Get All Animals
    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        return ResponseEntity.ok(animalDAO.findAll());
    }

    // Get Animal by ID
    @GetMapping("/{animalId}")
    public ResponseEntity<Object> getAnimalById(@PathVariable int animalId) {
        Animal a = animalDAO.findById(animalId);
        if (a == null) {
            return ResponseEntity.status(404).body("Could not find Animal with ID of " + animalId);
        }

        return ResponseEntity.ok(a);
    }

    // Insert Animal
    @PostMapping
    public ResponseEntity<Object> insertAnimal(@RequestBody AnimalDTO animalDTO) {
        Keeper k = keeperDAO.findById(animalDTO.getKeeperId());

        if (k == null) {
            ResponseEntity.status(404).body("Could not find Keeper by ID: " + animalDTO.getKeeperId());
        }

        Animal a = new Animal(
                animalDTO.getAnimalId(),
                animalDTO.getName(),
                animalDTO.getAge(),
                animalDTO.getDepartment(),
                k);

        animalDAO.save(a);

        if (a == null) {
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.status(201).body(a);
    }

    // Delete an Animal
    @DeleteMapping("/{animalId}")
    public ResponseEntity<Object> deleteAnimal(@PathVariable int animalId) {
        Animal a = animalDAO.findById(animalId);
        if (a == null) {
            return ResponseEntity.status(404).body("Could not find Animal with ID of " + animalId);
        }

        animalDAO.deleteById(animalId);
        return ResponseEntity.accepted().body("Animal " + a.getName() + " was removed from the system.");
    }


}
