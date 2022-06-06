package com.ifce.br.animes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.animes.model.Animes;

@Repository
public interface AnimesRepository extends JpaRepository<Animes, Long>{
    
}
