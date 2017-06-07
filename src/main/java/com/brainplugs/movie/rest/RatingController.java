package com.brainplugs.movie.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brainplugs.movie.models.MovieRating;
import com.brainplugs.movie.service.MovieRatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private MovieRatingService movieRatingService;
	
	@GetMapping("/all")
	public List<MovieRating> getAll(){
		return this.movieRatingService.getAverageMovieRatings();
	}
}
