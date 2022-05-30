package com.ifce.br.filmesspring.repository;

import com.ifce.br.filmesspring.model.Filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
