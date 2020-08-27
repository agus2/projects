package com.containers.ejemplo1.repository;

import com.containers.ejemplo1.repository.models.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PetRepository extends CrudRepository<Pet,Long>{
    Optional<Pet> findById(int id);
    Optional<Pet> findByName(String name);
}
