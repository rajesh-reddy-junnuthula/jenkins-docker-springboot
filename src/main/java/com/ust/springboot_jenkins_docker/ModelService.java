package com.ust.springboot_jenkins_docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    private ModelRepository repository;

    public Model addMessage(Model m) {
        return repository.save(m);
    }


    public List<Model> getMessage() {
        return repository.findAll();
    }
}
