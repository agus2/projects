package com.containers.ejemplo1.services;

import com.containers.ejemplo1.repository.models.Pet;
import com.containers.ejemplo1.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public void delete(Pet pet) {
        repo.delete(pet);
    }
}
