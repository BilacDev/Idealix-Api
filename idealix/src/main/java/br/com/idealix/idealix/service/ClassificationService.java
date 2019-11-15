package br.com.idealix.idealix.service;

import br.com.idealix.idealix.domain.Classification;
import br.com.idealix.idealix.repository.ClassificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassificationService {

    @Autowired
    private ClassificationRepository repository;

    public List<Classification> getClassification() {
        return repository.findAll();
    }

    public Classification getClassification(Long id) {
        return repository.findById(id).orElseGet(null);
    }

    public Classification saveClassification(Classification classification) {
        return repository.save(classification);
    }
}
