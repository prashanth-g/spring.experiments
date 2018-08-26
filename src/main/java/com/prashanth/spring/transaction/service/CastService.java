package com.prashanth.spring.transaction.service;

import com.prashanth.spring.transaction.model.Cast;
import com.prashanth.spring.transaction.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
class CastService {

    @Autowired
    private
    CastRepository castRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void createCast(Cast cast){
        try {
            castRepository.save(cast);
            // throw new RuntimeException("Rollback this transaction!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
