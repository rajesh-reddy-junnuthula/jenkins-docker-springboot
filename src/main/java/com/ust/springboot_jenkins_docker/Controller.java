package com.ust.springboot_jenkins_docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ModelService service;

    @PostMapping("/addMessage")
    public Model addMessage(@PathVariable Model m) {
        return service.addMessage(m);
    }

    @GetMapping("/getMessage")
    public List<Model> getMessage() {
        return service.getMessage();
    }
}
