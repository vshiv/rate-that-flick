package com.brainplugs.movie.models;

import com.brainplugs.movie.models.Movie.Genre;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class MovieRating {

	private String name;
	private Genre genre;
	private double averageRating;
	
	public void setName(final String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setRating(final double averageRating){
		this.averageRating = averageRating;
	}
	
	public double getAverageRating() {
		return averageRating;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}
	
	

}
