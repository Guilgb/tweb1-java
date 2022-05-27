package br.ifce.com.springpessoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ifce.com.springpessoa.model.Pessoa;
import br.ifce.com.springpessoa.repository.PessoaRepository;

@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository repositoryPessoa;

    public void registerService(Pessoa pessoa){
        repositoryPessoa.save(pessoa);
    }
}
