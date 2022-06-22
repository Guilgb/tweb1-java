package br.com.ifce.animes.repository;

import org.springframework.stereotype.Repository;

import br.com.ifce.animes.model.Anime;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>(){

}