package com.prashanth.spring.transaction.service;

import com.prashanth.spring.transaction.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prashanth.spring.transaction.model.Cast;

@Service
class CastService {

    @Autowired
    private
    CastRepository castRepository;

    void createCast(Cast cast){
        castRepository.save(cast);
    }
}
