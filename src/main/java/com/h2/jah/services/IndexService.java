package com.h2.jah.services;

import com.h2.jah.dtos.IndexDTO;
import com.h2.jah.entities.Index;

import java.util.List;

public interface IndexService {
    List<Index> findAll();
    Index findById(Long id);
    Index findByName(String name);
    Index create(IndexDTO indexDTO);
    Boolean existsById(Long id);
}
