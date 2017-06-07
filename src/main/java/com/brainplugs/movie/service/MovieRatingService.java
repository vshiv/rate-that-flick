package com.brainplugs.movie.service;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainplugs.movie.models.Movie;
import com.brainplugs.movie.models.MovieRating;
import com.brainplugs.movie.models.Social;
import com.brainplugs.movie.repository.MovieRepository;
import com.brainplugs.movie.repository.SocialRepository;



@Service
public class MovieRatingService {

	@Autowired
	private MovieRepository movieRepository;
	@Autowired 
	private SocialRepository socialRepository;
	
	public List<MovieRating> getAverageMovieRatings(){
		List<Movie> movies = movieRepository.findAll();
		List<Social> socials = socialRepository.findAll();
		
		return movies.stream().map(m -> {
			MovieRating movieRating = new MovieRating();
			movieRating.setName(m.getName());
			movieRating.setGenre(m.getGenre());
			OptionalDouble rating = socials.stream().filter(s -> s.getMovieId().equals(m.getId())).mapToDouble(Social::getRating).average();
			double averageRating = rating.isPresent() ? rating.getAsDouble() : 0.0;
		    movieRating.setRating(averageRating);
		    return movieRating;
		}).collect(Collectors.toList());
		
	}
}
