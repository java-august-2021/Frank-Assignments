package com.example.ninjaAndDojos.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninjaAndDojos.Models.Dojo;
import com.example.ninjaAndDojos.Repository.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;

	public List<Dojo> allDojo() {
		return dojoRepo.findAll();
	}

	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}

	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
}
