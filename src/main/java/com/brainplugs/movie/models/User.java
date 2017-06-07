package com.brainplugs.movie.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Document(collection="users")
public class User {

	@Id
	private String id;
	private String alias;
	private String email;

	public String getId() {
		return id;
	}

	public String getAlias() {
		return alias;
	}

	public String getEmail() {
		return email;
	}

	
	
}