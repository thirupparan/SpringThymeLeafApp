package com.sgic.leave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leave.entities.Role;

public interface RoleRepository extends JpaRepository<Role,String> {

}
