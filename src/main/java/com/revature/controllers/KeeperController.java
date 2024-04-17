package com.revature.controllers;

import com.revature.daos.KeeperDAO;
import com.revature.models.Keeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/keepers")
public class KeeperController {

    KeeperDAO keeperDAO;

    @Autowired
    public KeeperController(KeeperDAO keeperDAO) {
        this.keeperDAO = keeperDAO;
    }

    // Get All Keepers
    @GetMapping
    public ResponseEntity<List<Keeper>> getAllKeepers() {
        return ResponseEntity.ok(keeperDAO.findAll());
    }

    // Get Keeper by ID
    @GetMapping("/{keeperId}")
    public ResponseEntity<Object> getKeeperById(@PathVariable int keeperId) {
        Keeper k = keeperDAO.findById(keeperId);
        if (k == null) {
            return ResponseEntity.status(404).body("Could not find Keeper with ID of " + keeperId);
        }
        return ResponseEntity.ok(k);
    }

    // Insert Keeper
    @PostMapping
    public ResponseEntity<Keeper> insertKeeper(@RequestBody Keeper keeper) {
        Keeper k = keeperDAO.save(keeper);

        if (k == null) {
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.status(201).body(k);
    }

    // Update Keeper
    @PatchMapping("/{keeperId}")
    public ResponseEntity<Object> updateKeeper(@RequestBody Keeper keeper, @PathVariable int keeperId) {
        // Check if valid keeper id
        Keeper k = keeperDAO.findById(keeperId);
        if (k == null) {
            return ResponseEntity.status(404).body("Could not find Keeper with ID of " + keeperId);
        }
        keeper.setKeeperId(keeperId);
        keeperDAO.save(keeper);

        return ResponseEntity.ok(keeper);
    }

    // Delete Keeper
    @DeleteMapping("/{keeperId}")
    public ResponseEntity<Object> deleteKeeper(@PathVariable int keeperId) {
        Keeper k = keeperDAO.findById(keeperId);
        if (k == null) {
            return ResponseEntity.status(404).body("Could not find Keeper with ID " + keeperId);
        }
        keeperDAO.deleteById(keeperId);
        return ResponseEntity.accepted().body("Keeper " + k.getName());
    }
}
