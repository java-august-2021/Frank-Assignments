package com.example.user_registration.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.user_registration.Models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
