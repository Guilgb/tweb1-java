package br.com.ifce.animes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifce.animes.model.Anime;
import br.com.ifce.animes.repository.AnimeRepository;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository repositoryAnime;

    public void saveService(Anime anime){
        repositoryAnime.save(anime);
    }

    public List<Anime> listarService(){
        return repositoryAnime.findAll();
    }

    public void excluirService(Long id){
        repositoryAnime.deleteById(id);
    }
    
}
