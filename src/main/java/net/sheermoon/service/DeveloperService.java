package net.sheermoon.service;

import net.sheermoon.model.Developer;
import net.sheermoon.repository.DeveloperRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperService {
    private DeveloperRepository repository;

    public List<Developer> getAll() {
        return repository.findAll();
    }

    public Optional<Developer> get(long id){
        return repository.findById(id);
    }
}
