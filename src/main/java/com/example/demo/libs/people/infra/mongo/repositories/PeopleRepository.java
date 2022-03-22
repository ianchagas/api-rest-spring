package com.example.demo.libs.people.infra.mongo.repositories;
import com.example.demo.libs.people.implementations.PeopleInterface;
import java.util.List;
import com.example.demo.libs.people.infra.mongo.entities.PeopleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<PeopleEntity, String> {
    List<PeopleEntity> createPeople(String name, String email, String phone);

}