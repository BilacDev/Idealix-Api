package br.com.idealix.idealix.service;

import br.com.idealix.idealix.domain.Child;
import br.com.idealix.idealix.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChildService {

    @Autowired
    private ChildRepository repository;

    public List<Child> getChild() {
        return repository.findAll();
    }

    public Child getChild(Long id) {
        return repository.findById(id).orElseGet(null);
    }

    public Child saveChild(Child child) {
        return repository.save(child);
    }

    public void deleteChild(Long id) {
        repository.deleteById (id);
    }
}
