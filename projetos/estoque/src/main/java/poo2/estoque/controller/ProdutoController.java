package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.Produto;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/produto")
public class ProdutoController extends BaseRestController<Produto> {
    
    public ProdutoController(BaseBreadService<Produto> s) {
        super(s);
    }

}
