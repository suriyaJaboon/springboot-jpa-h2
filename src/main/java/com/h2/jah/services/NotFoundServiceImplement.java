package com.h2.jah.services;

import com.h2.jah.dtos.NotFoundDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NotFoundServiceImplement implements NotFoundService {

    @Override
    public ResponseEntity<?> notFound(String msg) {
        return new ResponseEntity<>(new NotFoundDTO(new Date(), HttpStatus.NOT_FOUND, msg), HttpStatus.NOT_FOUND);
    }
}
