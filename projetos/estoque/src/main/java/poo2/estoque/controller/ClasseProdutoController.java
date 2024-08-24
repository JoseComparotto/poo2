package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/classeproduto")
public class ClasseProdutoController extends BaseIdController<ClasseProduto> {
    
    public ClasseProdutoController(BaseBreadService<ClasseProduto> s) {
        super(s);
    }

}
