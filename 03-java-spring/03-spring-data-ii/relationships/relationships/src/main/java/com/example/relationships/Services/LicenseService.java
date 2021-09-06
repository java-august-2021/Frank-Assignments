package com.example.relationships.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.relationships.Models.License;
import com.example.relationships.Repository.LicenseRepository;
@Service
public class LicenseService {
	@Autowired
	public LicenseRepository slicense;
	
    public List<License> allLicense() {
        return slicense.findAll();
    }
    
    public License createBook(License l) {
        return slicense.save(l);
    }
    
    public License findLicense(Long id) {
        Optional<License> optionalLicense = slicense.findById(id);
        if(optionalLicense.isPresent()) {
            return optionalLicense.get();
        } else {
            return null;
        }
    }
}
