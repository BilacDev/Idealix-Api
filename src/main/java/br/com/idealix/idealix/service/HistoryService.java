package br.com.idealix.idealix.service;

import br.com.idealix.idealix.domain.History;
import br.com.idealix.idealix.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HistoryService {

    @Autowired
    private HistoryRepository repository;

    public List<History> getHistory() {
        return repository.findAll();
    }

    public History getHistory(Long id) {
        return repository.findById(id).orElseGet(null);
    }

    public History saveHistory(History history) {
        return repository.save(history);
    }

    public void deleteHistory(Long id) {
        repository.deleteById (id);
    }
}
