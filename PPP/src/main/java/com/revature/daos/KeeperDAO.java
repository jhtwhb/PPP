package com.revature.daos;

import com.revature.models.Keeper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeeperDAO extends JpaRepository<Keeper, Integer> {
    public Keeper findById(int keeperId);
}
