package br.com.ifce.animes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.ifce.animes.model.Anime;
import br.com.ifce.animes.repository.AnimeRepository;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository repositoryAnime;

    public void saveService(Anime anime, MultipartFile imagem){
        String caminho = "images/" + anime.getNome() + ".png";
         
        repositoryAnime.save(anime);
    }

    public List<Anime> listarService(){
        return repositoryAnime.findAll();
    }

    public void excluirService(Long id){
        repositoryAnime.deleteById(id);
    }

    public Optional<Anime> findId(Long id){
        return repositoryAnime.findById(id);
    }
    
    public void updateService(Long id){
        repositoryAnime.findById(id);
    }
    
}
