package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.SubclasseProduto;
import poo2.estoque.service.BaseService;

//@RestController
//@RequestMapping("/api/estoque/classeproduto")
public class SubclasseProdutoController extends BaseIdController<SubclasseProduto> {
    
    public SubclasseProdutoController(BaseService<SubclasseProduto> s) {
        super(s);
    }

}
