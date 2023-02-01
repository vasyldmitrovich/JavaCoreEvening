package com.prostopizza.repository;

import com.prostopizza.model.Pizzerias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriasRepository extends JpaRepository<Pizzerias,Long> {
}
