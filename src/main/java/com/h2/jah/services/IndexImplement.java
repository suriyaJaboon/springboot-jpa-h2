package com.h2.jah.services;

import com.h2.jah.dtos.IndexDTO;
import com.h2.jah.entities.Index;
import com.h2.jah.repositories.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexImplement implements IndexService {
    @Autowired
    private IndexRepository indexRepository;

    @Override
    public List<Index> findAll() {
//        List<Index> indexList = new ArrayList<>();
//        this.indexRepository.findAll().iterator().forEachRemaining(indexList::add);
//        return indexList;
        return this.indexRepository.findAll();
    }

    @Override
    public Index findById(Long id) {
        return this.indexRepository.findById(id).get();
    }

    @Override
    public Index findByName(String name) {
        return this.indexRepository.findByName(name);
    }

    @Override
    public Index create(IndexDTO indexDTO) {
        Index index = new Index();
        index.setName(indexDTO.getName());
        index.setAction(indexDTO.getAction());
        return this.indexRepository.save(index);
    }

    @Override
    public Boolean existsById(Long id) {
        return this.indexRepository.existsById(id);
    }
}
