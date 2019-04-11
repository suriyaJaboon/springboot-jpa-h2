package com.h2.jah.controllers;

import com.h2.jah.dtos.IndexDTO;
import com.h2.jah.entities.Index;
import com.h2.jah.services.IndexService;
import com.h2.jah.services.NotFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "index")
public class IndexController {

    @Autowired
    private IndexService indexService;
    @Autowired
    private NotFoundService notFoundService;
    @GetMapping
    public List<Index> index() {
        return this.indexService.findAll();
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<?> findById(@Validated @PathVariable Long id) {
        if (this.indexService.existsById(id)) {
            return ResponseEntity.ok(this.indexService.findById(id));
        } else {
            return this.notFoundService.notFound(String.format("find by [ID: %s] not found.", id));
        }
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity<?> findByName(@Validated @PathVariable String name) {
       Index index = this.indexService.findByName(name);
       if (index != null) {
           return ResponseEntity.ok(index);
       } else {
           return this.notFoundService.notFound(String.format("find by [NAME: %s] not found.", name));
       }
    }
    @PostMapping
    public Index create(@Validated @RequestBody IndexDTO indexDTO) {
        return this.indexService.create(indexDTO);
    }
}
