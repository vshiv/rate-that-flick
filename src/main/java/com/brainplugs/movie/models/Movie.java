package com.brainplugs.movie.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Document(collection="movies")
public class Movie {
	@Id
	private String id;
	private String name;	
	private Genre genre;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Genre getGenre() {
		return genre;
	}

	static enum Genre {
		ACTION,
		COMEDY,
		DRAMA,
		HORROR,
		SCIFI,
		FANTASY,
		ROMANCE
	}
}
