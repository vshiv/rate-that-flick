package com.brainplugs.movie.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brainplugs.movie.models.User;
import com.brainplugs.movie.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    
	private UserRepository userRepository;
    
	public UserController(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
    
	@GetMapping("/all")
	public List<User> getAll(){
		return this.userRepository.findAll();
	}
	
	@PutMapping
	public void insert(@RequestBody User user) {
		this.userRepository.insert(user);
	}

	@PostMapping
	public void update(@RequestBody User user) {
		this.userRepository.save(user);
	}

}
