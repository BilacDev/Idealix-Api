package br.com.idealix.idealix.repository;

import br.com.idealix.idealix.domain.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
    void deleteById(Long id);
}
