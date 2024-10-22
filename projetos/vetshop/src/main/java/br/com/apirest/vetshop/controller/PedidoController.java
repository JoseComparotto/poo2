package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Pedido;
import br.com.apirest.vetshop.service.BaseBreadService;

@RestController
@RequestMapping("/api/vetshop/pedidos")
public class PedidoController extends BaseRestController<Pedido> {

    public PedidoController(BaseBreadService<Pedido> s) {
        super(s);
    }
    
}
