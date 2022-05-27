package br.ifce.com.springpessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.ifce.com.springpessoa.model.Pessoa;
import br.ifce.com.springpessoa.service.PessoaService;

@Controller
public class PessoaController {
    
    @Autowired
    private PessoaService servicePessoa;
    
    @GetMapping("pessoa/form")
    public String form(){
        return "form";
    }

    @GetMapping("/pessoa/salvar")
    public String salve(Pessoa pessoa){
        servicePessoa.registerService(pessoa);
        return "salvesalve";
    }

}
