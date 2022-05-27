package br.com.ifce.springtweb1.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import br.com.ifce.springtweb1.model.Pedido;

@Controller
public class homeController {
    @GetMapping("/home")
    public String homeController(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Card Magic");
        pedido.setUrlProduto("https://www.amazon.com.br/Magic-Gathering-Timeless-Voyager-Planeswalker/dp/B0883DDLYM/ref=asc_df_B0883DDLYM/?tag=googleshopp00-20&linkCode=df0&hvadid=398201773809&hvpos=&hvnetw=g&hvrand=1633739403614267418&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1031682&hvtargid=pla-918031711379&psc=1");
        pedido.setUlrImagem("https://m.media-amazon.com/images/I/81TPbcy682L._AC_SX679_.jpg");
        pedido.setDescricao("TEAM UP WITH A PLANESWALKER AND LAUNCH INTO BATTLE! This 60-card Magic: The Gathering (MTG) starter deck is ready to play right out of the box.");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
