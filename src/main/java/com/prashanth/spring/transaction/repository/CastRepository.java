package com.prashanth.spring.transaction.repository;

import org.springframework.data.repository.CrudRepository;
import com.prashanth.spring.transaction.model.Cast;
import org.springframework.stereotype.Repository;

@Repository
public interface CastRepository extends CrudRepository<Cast, Integer> {

}
