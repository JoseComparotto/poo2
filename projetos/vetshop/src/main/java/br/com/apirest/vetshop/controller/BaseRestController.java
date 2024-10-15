package br.com.apirest.vetshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.apirest.vetshop.service.BaseBreadService;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseRestController<TModel> {
    
    @Autowired
    protected BaseBreadService<TModel> service;

    public BaseRestController(BaseBreadService<TModel> s){
        this.service = s;
    }

    @GetMapping("")
    public ResponseEntity<List<TModel>> getAll(){
        List<TModel> td = this.service.browse();
        
        if(td.size() == 0)
            return new ResponseEntity<>(td, HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<>(td, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TModel> getById(@PathVariable Long id){        
        Optional<TModel> opt = this.service.read(id);
        
        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public ResponseEntity<TModel> post(@RequestBody TModel td) {
        TModel tdnew = this.service.add(td);
        return new ResponseEntity<>(tdnew, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TModel> put(@PathVariable Long id, @RequestBody TModel td){
        Optional<TModel> opt = this.service.edit(id, td);

        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TModel> delete(@PathVariable Long id){
        Optional<TModel> opt = this.service.delete(id);

        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
