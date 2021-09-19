package com.code.exam.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.exam.Models.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {
	User findByEmail(String email);
}
