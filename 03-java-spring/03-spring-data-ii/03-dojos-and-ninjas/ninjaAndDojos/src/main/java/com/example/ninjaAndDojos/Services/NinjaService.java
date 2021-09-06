package com.example.ninjaAndDojos.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ninjaAndDojos.Models.Ninja;
import com.example.ninjaAndDojos.Repository.NinjaRepository;
@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjarepo;
	
    public List<Ninja> allNinja() {
        return ninjarepo.findAll();
    }
    
    public Ninja createNinja(Ninja n) {
        return ninjarepo.save(n);
    }
    
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjarepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
 }
}