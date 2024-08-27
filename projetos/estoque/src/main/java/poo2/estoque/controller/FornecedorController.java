package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.Fornecedor;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/fornecedor")
public class FornecedorController extends BaseRestController<Fornecedor> {
    
    public FornecedorController(BaseBreadService<Fornecedor> s) {
        super(s);
    }

}
