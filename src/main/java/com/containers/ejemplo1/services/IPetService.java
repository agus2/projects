package com.containers.ejemplo1.services;

import com.containers.ejemplo1.repository.models.Pet;

import java.util.List;

public interface IPetService {
     void add(Pet pet);
     List<Pet> getAll();
     void update(Pet pet);
     void delete(Pet pet);
}
