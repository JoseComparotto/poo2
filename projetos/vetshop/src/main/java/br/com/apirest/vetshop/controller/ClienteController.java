package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Cliente;
import br.com.apirest.vetshop.service.BaseBreadService;

@RestController
@RequestMapping("/api/vetshop/clientes")
public class ClienteController extends BaseRestController<Cliente> {

    public ClienteController(BaseBreadService<Cliente> s) {
        super(s);
    }
    
}
