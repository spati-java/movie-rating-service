package com.p.ratingdataservice.resources;

import com.p.ratingdataservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ratings")
public class RatingResource {


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId")  String movieId){
        return new Rating(movieId, 4);
    }
}
