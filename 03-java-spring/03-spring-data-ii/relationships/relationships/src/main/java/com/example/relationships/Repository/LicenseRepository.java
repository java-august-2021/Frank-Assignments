package com.example.relationships.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.relationships.Models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	List<License> findAll();
}
