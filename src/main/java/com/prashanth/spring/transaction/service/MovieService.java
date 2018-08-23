package com.prashanth.spring.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    CastService castService;

    public void createMovie() {

    }

}
