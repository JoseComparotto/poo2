package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Produto;
import br.com.apirest.vetshop.service.BaseBreadService;

@RestController
@RequestMapping("/api/vetshop/produtos")
public class ProdutoController extends BaseRestController<Produto> {

    public ProdutoController(BaseBreadService<Produto> s) {
        super(s);
    }
    
}
