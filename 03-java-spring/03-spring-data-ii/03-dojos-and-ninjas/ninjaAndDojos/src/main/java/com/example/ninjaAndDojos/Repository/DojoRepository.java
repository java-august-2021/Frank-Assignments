package com.example.ninjaAndDojos.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ninjaAndDojos.Models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
    List<Dojo> findAll();
}
