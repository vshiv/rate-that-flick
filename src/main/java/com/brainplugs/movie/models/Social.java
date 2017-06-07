package com.brainplugs.movie.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Document(collection = "social")
public class Social {

    @Id
	private String id;
	private String userId;
	private String movieId;
	private String comment;
	private float rating;
	
	public String getId() {
		return id;
	}
	public String getUserId() {
		return userId;
	}
	public String getMovieId() {
		return movieId;
	}
	public String getComment() {
		return comment;
	}
	public float getRating() {
		return rating;
	}
}
