package com.dixit.client.client_server.controller;

import com.dixit.client.client_server.Repository.PersonRepo;
import com.dixit.client.client_server.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/client")
public class PersonController {


    @Autowired
    PersonRepo repository;

    @PostMapping("/post")
    public Person addPerson(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping("/getAll")
    public List<Person> getAllPerson(){
        return repository.findAll();
    }


}
