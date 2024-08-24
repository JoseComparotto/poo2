package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.SubclasseProduto;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/subclasse-produto")
public class SubclasseProdutoController extends BaseRestController<SubclasseProduto> {
    
    public SubclasseProdutoController(BaseBreadService<SubclasseProduto> s) {
        super(s);
    }

}
