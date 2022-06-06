package com.ifce.br.animes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.animes.model.Animes;
import com.ifce.br.animes.repository.AnimesRepository;


@Service
public class AnimeService {
    @Autowired
    private AnimesRepository repositoryAnime;

    public void saveService(Animes anime){
        repositoryAnime.save(anime);
    }

    public List<Animes> listar(){
        return repositoryAnime.findAll();
    }
}
