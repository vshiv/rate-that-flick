package com.brainplugs.movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brainplugs.movie.models.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

}
