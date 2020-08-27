package com.containers.ejemplo1.controllers;

import com.containers.ejemplo1.repository.models.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
public interface IPetController {

    @PostMapping("/add")
    ResponseEntity<Void> add(@RequestBody Pet pet);
    @GetMapping("/list")
    ResponseEntity<List<Pet>> list();
    @DeleteMapping("/delete")
    ResponseEntity<Void> delete(@RequestBody Pet pet);
}
