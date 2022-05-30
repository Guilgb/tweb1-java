package com.ifce.br.filmesspring.service;

import java.util.List;

import com.ifce.br.filmesspring.model.Filme;
import com.ifce.br.filmesspring.repository.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    
    @Autowired
    private FilmeRepository repositoryFilme;

    public void registerService(Filme filme){
        repositoryFilme.save(filme);
    }

    public List<Filme> listarFilmes(){
        return repositoryFilme.findAll();
    }
}
