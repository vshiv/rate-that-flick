package com.brainplugs.movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brainplugs.movie.models.User;

public interface UserRepository extends MongoRepository<User, String> {

}
