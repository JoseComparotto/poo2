package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Categoria;
import br.com.apirest.vetshop.service.BaseBreadService;

@RestController
@RequestMapping("/api/vetshop/categorias")
public class CategoriaController extends BaseRestController<Categoria> {

    public CategoriaController(BaseBreadService<Categoria> s) {
        super(s);
    }
    
}
