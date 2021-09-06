package com.example.relationships.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.relationships.Models.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
    List<Person> findAll();
}
