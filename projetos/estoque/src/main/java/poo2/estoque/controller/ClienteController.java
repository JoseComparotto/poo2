package poo2.estoque.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.Cliente;
import poo2.estoque.service.BaseBreadService;

@RestController
@RequestMapping("/api/estoque/cliente")
public class ClienteController extends BaseRestController<Cliente> {
    
    public ClienteController(BaseBreadService<Cliente> s) {
        super(s);
    }

}
