package com.brainplugs.movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brainplugs.movie.models.Social;

public interface SocialRepository extends MongoRepository<Social, String> {

}
