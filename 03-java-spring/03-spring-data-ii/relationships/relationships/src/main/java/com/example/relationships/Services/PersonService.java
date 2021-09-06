package com.example.relationships.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.relationships.Models.Person;
import com.example.relationships.Repository.PersonRepository;

public class PersonService {
	@Autowired
	public PersonRepository sPerson;
	
    public List<Person> allLicense() {
        return sPerson.findAll();
    }
    
    public Person createBook(Person l) {
        return sPerson.save(l);
    }
    
    public Person findPerson(Long id) {
        Optional<Person> optionalPerson= sPerson.findById(id);
        if(optionalPerson.isPresent()) {
            return optionalPerson.get();
        } else {
            return null;
        }
    }
}
