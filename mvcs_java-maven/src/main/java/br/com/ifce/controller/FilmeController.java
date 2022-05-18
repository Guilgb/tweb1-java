package br.com.ifce.controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;

public class FilmeController {
    private FilmeService serviceFilme = new FilmeService();

    public void registerController(Filme filme){
        serviceFilme.registerService(filme);
    }
}
