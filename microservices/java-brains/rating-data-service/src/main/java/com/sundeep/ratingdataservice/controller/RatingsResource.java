package com.sundeep.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sundeep.ratingdataservice.model.Rating;
import com.sundeep.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	@RequestMapping("/movies/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
//		UserRating userRating = new UserRating();
//		userRating.initData(userId);
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4), 
				new Rating("5678", 3)
		);
		
		UserRating userRating = new UserRating();
		userRating.setRatings(ratings);
		return userRating;
	}
}
