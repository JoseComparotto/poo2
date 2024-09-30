package poo2.estoque.controller;

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

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.domain.BaseId;
import poo2.estoque.service.BaseBreadService;

@MappedSuperclass
public abstract class BaseRestController<TDomain extends BaseId> {
    
    @Autowired
    protected BaseBreadService<TDomain> service;

    public BaseRestController(BaseBreadService<TDomain> s){
        this.service = s;
    }

    @GetMapping("")
    public ResponseEntity<List<TDomain>> getAll(){
        List<TDomain> td = this.service.browse();
        
        if(td.size() == 0)
            return new ResponseEntity<>(td, HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<>(td, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TDomain> getById(@PathVariable Long id){        
        Optional<TDomain> opt = this.service.read(id);
        
        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public ResponseEntity<TDomain> post(@RequestBody TDomain td) {
        TDomain tdnew = this.service.add(td);
        return new ResponseEntity<>(tdnew, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TDomain> put(@PathVariable Long id, @RequestBody TDomain td){
        Optional<TDomain> opt = this.service.edit(id, td);

        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TDomain> delete(@PathVariable Long id){
        Optional<TDomain> opt = this.service.delete(id);

        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
