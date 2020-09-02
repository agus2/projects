package com.containers.ejemplo1.repository;

import com.containers.ejemplo1.repository.models.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Integer>{
}
