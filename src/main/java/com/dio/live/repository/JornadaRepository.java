package com.dio.live.repository;

import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

//extending 'JpaRepository', all CRUD operations become available from these interface
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
