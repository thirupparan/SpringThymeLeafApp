package com.sgic.leave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leave.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

	User findOne(String email);

}
