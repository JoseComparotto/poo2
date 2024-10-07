package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.model.ClasseProduto;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/classe-produto")
public class ClasseProdutoController extends BaseRestController<ClasseProduto> {
    
    public ClasseProdutoController(BaseBreadService<ClasseProduto> s) {
        super(s);
    }

}
