package br.com.idealix.idealix.service;

import br.com.idealix.idealix.domain.Responsible;
import br.com.idealix.idealix.repository.ResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResponsibleService {

    @Autowired
    private ResponsibleRepository repository;

    public List<Responsible> getResponsible() {
        return repository.findAll();
    }

    public Responsible getResponsible(Long id) {
        return repository.findById(id).orElseGet(null);
    }

    public Responsible saveResponsible(Responsible responsible) {
        return repository.save(responsible);
    }

    public void deleteResponsible(Long id) {
        repository.deleteById (id);
    }

//    public void editResponsible(Responsible responsible) {
//        repository.save(responsible);
//    }

//    public Responsible edit(Responsible newResponsible, Long id) {
//        Responsible responsible = dao.findOne(id);
//        responsible.setName(newResponsible.getName());
//        // Fazer a linha de cima para todos os campos que quer atualizar
//        return dao.save(responsible);
//    }
}
