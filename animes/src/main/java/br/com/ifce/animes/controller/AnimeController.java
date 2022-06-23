package br.com.ifce.animes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ifce.animes.model.Anime;
import br.com.ifce.animes.service.AnimeService;

@Controller
public class AnimeController {
    @Autowired
    private AnimeService serviceAnime;

    @GetMapping("anime/form")
    public ModelAndView form(){
        ModelAndView mv = new ModelAndView("form");
        mv.addObject("anime", new Anime());
        return mv;
    }

    @RequestMapping("anime/save")
    public ModelAndView save(Anime anime){
        serviceAnime.saveService(anime);
        ModelAndView mv = new ModelAndView("redirect:/anime/listar");
        return mv;
    }

    @GetMapping("/anime/listar")
    public ModelAndView lista(){
        List<Anime> animeLista = serviceAnime.listarService();
        ModelAndView mv = new ModelAndView("lista");
        mv.addObject("listarAnime", animeLista);
        return mv;
    }

    @GetMapping("anime/delete/{id}")
    public ModelAndView excluir(@PathVariable Long id){
        serviceAnime.excluirService(id);
        ModelAndView mv = new ModelAndView("redirect:/anime/listar");
        return mv;
    }

    @RequestMapping("/anime/update/{id}")
    public ModelAndView update(@PathVariable Long id){
        Optional<Anime> anime = serviceAnime.findId(id);
        ModelAndView mv = new ModelAndView("form");
        mv.addObject("anime", anime);
        return mv;
    }
}
