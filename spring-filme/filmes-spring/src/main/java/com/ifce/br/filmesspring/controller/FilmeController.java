package com.ifce.br.filmesspring.controller;

import java.util.List;

import com.ifce.br.filmesspring.model.Filme;
import com.ifce.br.filmesspring.service.FilmeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FilmeController {
    
    @Autowired
    private FilmeService serviceFilme;

    @GetMapping("filme/form")
    public String form(){
        return "filme-form";
    }

    @GetMapping("filme/salve")
    public String salve(Filme filme){
        serviceFilme.registerService(filme);
        return "save";
    }

    @GetMapping("filme/listar")
    public ModelAndView listar(){
        List<Filme> filmes =  serviceFilme.listarFilmes();
        ModelAndView mv = new ModelAndView("lista");
        mv.addObject("listarFilmes", filmes);
        return mv;
    }
}
