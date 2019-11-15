package br.com.idealix.idealix.repository;

import br.com.idealix.idealix.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {

}
