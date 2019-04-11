package com.h2.jah.services;

import org.springframework.http.ResponseEntity;

public interface NotFoundService {
    ResponseEntity<?> notFound(String msg);
}
