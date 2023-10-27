package com.exp3.exp3.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exp3.exp3.Model.User;
@Repository
public interface UserRepo extends CrudRepository<User, Long> { }
