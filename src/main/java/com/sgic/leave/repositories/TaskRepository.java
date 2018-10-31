package com.sgic.leave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leave.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}