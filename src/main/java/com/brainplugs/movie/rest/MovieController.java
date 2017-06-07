package com.brainplugs.movie.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brainplugs.movie.models.Movie;
import com.brainplugs.movie.repository.MovieRepository;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
	private MovieRepository movieRepository;
    
	public MovieController(final MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
    
	@GetMapping("/all")
	public List<Movie> getAll(){
		return this.movieRepository.findAll();
	}
	
	@PutMapping
	public void insert(@RequestBody Movie movie) {
		this.movieRepository.insert(movie);
	}

	@PostMapping
	public void update(@RequestBody Movie movie) {
		this.movieRepository.save(movie);
	}

}
