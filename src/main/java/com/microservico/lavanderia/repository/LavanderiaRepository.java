package com.microservico.lavanderia.repository;

import com.microservico.lavanderia.domain.Lavanderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LavanderiaRepository extends JpaRepository<Lavanderia, Long> {


}
