package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class FilmeService {
    private FilmeRepository repositoryFilme = new FilmeRepository();

    public void registerService(Filme filme){
        repositoryFilme.registerRepository(filme);
    }
}