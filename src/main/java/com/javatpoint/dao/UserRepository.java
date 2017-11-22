package com.javatpoint.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, Integer> {}  
