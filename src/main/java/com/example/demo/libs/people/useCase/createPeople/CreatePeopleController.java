package com.example.demo.libs.people.useCase.createPeople;

import com.example.demo.libs.people.infra.mongo.entities.PeopleEntity;
import com.example.demo.libs.people.infra.mongo.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class CreatePeopleController {
    @Autowired()
    PeopleRepository peopleRepository;

    @PostMapping("/create-people")
    public void createPeople(@RequestBody PeopleEntity peopleEntity) {

    }
}
