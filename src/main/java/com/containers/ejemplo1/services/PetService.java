package com.containers.ejemplo1.services;

import com.containers.ejemplo1.repository.models.Pet;
import com.containers.ejemplo1.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetService implements IPetService {
    @Autowired
    private PetRepository repo;

    @Override
    public void add(Pet pet) {
        repo.save(pet);
    }

    @Override
    public List<Pet> getAll() {
        List<Pet> list = new ArrayList<Pet>();
        repo.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public void update(Pet pet) {
        repo.save(pet);
    }

    @Override
    public void delete(String id_pet) {
       int id = Integer.parseInt(id_pet);
        //repo.findById(id);
        repo.deleteById(id);
    }
}
