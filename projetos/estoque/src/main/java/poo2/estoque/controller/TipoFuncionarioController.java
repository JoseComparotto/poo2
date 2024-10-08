package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.model.TipoFuncionario;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/tipo-funcionario")
public class TipoFuncionarioController extends BaseRestController<TipoFuncionario> {
    
    public TipoFuncionarioController(BaseBreadService<TipoFuncionario> s) {
        super(s);
    }

}
