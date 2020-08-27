package com.containers.ejemplo1.controllers;

import com.containers.ejemplo1.repository.models.Pet;
import com.containers.ejemplo1.services.IPetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController implements IPetController{

    private final IPetService service;

    @Override
    public ResponseEntity<Void> add(Pet pet) {
        service.add(pet);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<List<Pet>> list() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.getAll());
    }

    @Override
    public ResponseEntity<Void> delete(Pet pet) {
        service.delete(pet);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
