package net.sheermoon.controller;

import net.sheermoon.model.Developer;
import net.sheermoon.service.DeveloperService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping
@RestController("/api/developers")
public class DeveloperRestController {
    private DeveloperService service;

    @GetMapping
    public List<Developer> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Developer> getById(@PathVariable long id){
        return service.get(id);
    }

}
