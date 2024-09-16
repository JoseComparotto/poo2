package poo2.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.MappedSuperclass;
import poo2.estoque.domain.BaseId;

@MappedSuperclass
public interface IBaseJpaRepository<TDomain extends BaseId> extends JpaRepository<TDomain, Long>{
    
}
