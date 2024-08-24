package poo2.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.service.BaseService;

@MappedSuperclass
public abstract class BaseIdController<TDomain> {
    
    @Autowired
    protected BaseService<TDomain> service;

    public BaseIdController(BaseService<TDomain> s){
        this.service = s;
    }

    @GetMapping("")
    public List<TDomain> getAll(){
        List<TDomain> td = this.service.browse();
        return td;
    }

    @GetMapping("/{id}")
    public TDomain getById(@PathVariable Long id){        
        TDomain td = this.service.read(id);
        return td;
    } 

    @PostMapping("")
    public TDomain post(@RequestBody TDomain td) {
        TDomain tdnew = this.service.add(td);
        return tdnew;
    }

    @PutMapping("/{id}")
    public TDomain put(@PathVariable Long id, @RequestBody TDomain td){
        TDomain tdalt = this.service.edit(id, td);
        return tdalt;
    }

    @DeleteMapping("/{id}")
    public TDomain delete(@PathVariable Long id){
        TDomain tddel = this.service.delete(id);
        return tddel;
    }

}
