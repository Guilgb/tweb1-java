package br.com.ifce.view;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class FilmeView {
    public static void main(String[] args) {
        Filme filme = new Filme("titulo", "data", 120, 20);

        FilmeController controllerFilme = new FilmeController();
        
        controllerFilme.registerController(filme);
    }
}
