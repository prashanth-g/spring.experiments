package com.prashanth.spring.transaction.service;

import com.prashanth.spring.transaction.model.Cast;
import com.prashanth.spring.transaction.model.Movie;
import com.prashanth.spring.transaction.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MovieService {

    @Autowired
    private
    MovieRepository movieRepository;

    @Autowired
    private
    CastService castService;

    @Transactional(propagation = Propagation.REQUIRED)
    public void createMovie(Movie movie) {
        movieRepository.save(movie);
        Cast cast = new Cast();
        cast.setName("actor01");
        try {
            // TODO: Save CAST
            castService.createCast(cast);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
