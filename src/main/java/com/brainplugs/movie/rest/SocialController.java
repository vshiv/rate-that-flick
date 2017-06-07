package com.brainplugs.movie.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brainplugs.movie.models.Social;
import com.brainplugs.movie.repository.SocialRepository;

@RestController
@RequestMapping("/social")
public class SocialController {
    
	private SocialRepository socialRepository;
    
	public SocialController(final SocialRepository socialRepository) {
		this.socialRepository = socialRepository;
	}
    
	@GetMapping("/all")
	public List<Social> getAll(){
		return this.socialRepository.findAll();
	}
	
	@PutMapping
	public void insert(@RequestBody Social social) {
		this.socialRepository.insert(social);
	}

	@PostMapping
	public void update(@RequestBody Social social) {
		this.socialRepository.save(social);
	}

}
