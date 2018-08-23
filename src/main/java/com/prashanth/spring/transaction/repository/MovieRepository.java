package com.prashanth.spring.transaction.repository;

import com.prashanth.spring.transaction.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
