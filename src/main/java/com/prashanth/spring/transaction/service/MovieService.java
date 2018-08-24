package com.prashanth.spring.transaction.service;

import com.prashanth.spring.transaction.model.Movie;
import com.prashanth.spring.transaction.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    CastService castService;

    @Transactional
    public void createMovie() {
        Movie movie = new Movie();
        movie.setMovieName("VTV");
        movie.setYear(2010);
        try {
            // TODO: Save CAST
        } catch (Exception ex) {

        }
    }

}
