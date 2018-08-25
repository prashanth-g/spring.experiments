package com.prashanth.spring.transaction.controller;

import com.prashanth.spring.transaction.model.Movie;
import com.prashanth.spring.transaction.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    @Autowired
    private
    MovieService movieService;

    @GetMapping("/transaction/add")
    public String addRecord(@RequestParam String movieName
            , @RequestParam String movieYear) {
        Movie movie = new Movie();
        movie.setMovieName(movieName);
        movie.setYear(Integer.parseInt(movieYear));
        movieService.createMovie(movie);
        return "Saved";
    }

}
