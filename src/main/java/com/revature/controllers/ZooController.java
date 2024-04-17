//package com.revature.controllers;

//import com.revature.daos.ZooDAO;
import com.revature.models.Keeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/keepers")
//public class ZooController {

    /*
    ZooDAO zooDAO;

    @Autowired
    public ZooController(ZooDAO zooDAO) {
        this.zooDAO = zooDAO;
    }

    // Select all items from the items table
    @GetMapping
    public ResponseEntity<List<Keeper>> getAllKeepers() {
        List<Keeper> keepers = zooDAO.findAll();

        return ResponseEntity.ok(keepers);
    }
    */
    /*
    // Select one item by its ID
    @GetMapping("/{keeperId}")
    public ResponseEntity<Object> getKeeperById(@PathVariable int id) {
        Optional<Keeper> k = zooDAO.findById(id);

        if (k == null) {
            return ResponseEntity.notFound().build();
        }
        return null;
    }*/

    // Select all items that belong to a certain user
    /*
    @GetMapping
    public ResponseEntity<List<Animal>> getAllOwnedById(@PathVariable int id) {
        List<Animal> animals = zooDAO.findAll();
        return ResponseEntity.ok(animals);
    }*/

    /*
    // Insert a new item into the table
    @PostMapping
    public ResponseEntity<Keeper> insertKeeper(@RequestBody Keeper keeper) {
        Keeper k = zooDAO.save(keeper);

        if (k == null) {
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok(k);
    }*/

    //Update a user
    /*
    @PatchMapping
    public ResponseEntity<Keeper> updateKeeper(@RequestBody int id, String name, String department) {
        Optional<Keeper> k = zooDAO.findById(id);
        if (k == null) {
            return ResponseEntity.notFound().build();
        }

    }
     */

    //Delete an item
    /*
    @DeleteMapping
    public ResponseEntity<Keeper> removeKeeper(@RequestBody int id) {

    }
     */

    //[Some other functionality of your choice]

/*
Select all items from the items table
Get All Animals

· Select one item by its ID
Get An Animal by ID

· Select all items that belong to a certain user (find by user id FK) =================

o This may be the trickiest one, but shouldn’t be too bad

· Insert a new item into the items table
Insert Animal

· Insert a new user into the users table
Insert Keeper

· Update a user
Update Keeper

· Delete an item
Delete an Animal

· [Some other functionality of your choice]

 */

//}
