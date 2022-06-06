package com.ifce.br.animes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.animes.model.Animes;
import com.ifce.br.animes.service.AnimeService;

@Controller
public class AnimeController {
    @Autowired
    private AnimeService serviceAnime;

    @GetMapping("animes/form")
    public String form(){
        return "form";
    }
    
    @GetMapping("animes/save")
    public String save(Animes anime){
        serviceAnime.saveService(anime);
        return "save";
    }

    @GetMapping("animes/listar")
    public ModelAndView listar(){
        List<Animes> animes = serviceAnime.listar();
        ModelAndView mv = new ModelAndView("lista");
        mv.addObject("listarAnimes", animes);
        return mv;
    }

    @GetMapping("animes/delete/{id}")
    public ModelAndView excluir(@PathVariable Long id){
        serviceAnime.excluir(id);
        ModelAndView mv = new ModelAndView("redirect:/animes/listar");
        return mv;
    }
}
