package poo2.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.service.BaseService;

@RestController
@RequestMapping("/api/estoque/classeproduto")
public class ClasseProdutoController {
    
    @Autowired
    private BaseService<ClasseProduto> service;

    public ClasseProdutoController(BaseService<ClasseProduto> s){
        this.service = s;
    }

    @GetMapping("/")
    public List<ClasseProduto> getAll(){
        List<ClasseProduto> cp = this.service.browse();
        return cp;
    }

    @GetMapping("/{id}")
    public ClasseProduto getById(@PathVariable Long id){        
        ClasseProduto cp = this.service.read(id);
        return cp;
    } 

    @PostMapping("/")
    public ClasseProduto post(@RequestBody ClasseProduto cp) {
        ClasseProduto cpnew = this.service.add(cp);
        return cpnew;
    }

    @PutMapping("/{id}")
    public ClasseProduto put(@RequestBody ClasseProduto cp){
        ClasseProduto cpalt = this.service.edit(cp);
        return cpalt;
    }

    @DeleteMapping("/{id}")
    public ClasseProduto delete(@PathVariable Long id){
        ClasseProduto cpdel = this.service.delete(id);
        return cpdel;
    }

}
