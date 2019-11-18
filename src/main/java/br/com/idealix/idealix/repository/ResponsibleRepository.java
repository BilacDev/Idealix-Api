package br.com.idealix.idealix.repository;

import br.com.idealix.idealix.domain.Responsible;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponsibleRepository extends JpaRepository<Responsible, Long> {
    void deleteById(Long id);
}
