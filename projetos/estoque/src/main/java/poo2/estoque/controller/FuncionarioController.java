package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.Funcionario;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/funcionario")
public class FuncionarioController extends BaseRestController<Funcionario> {
    
    public FuncionarioController(BaseBreadService<Funcionario> s) {
        super(s);
    }

}
