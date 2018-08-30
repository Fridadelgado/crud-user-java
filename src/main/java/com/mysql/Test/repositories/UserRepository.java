package com.mysql.Test.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mysql.Test.models.User ;

public interface UserRepository extends CrudRepository<User, Long> {

}


