package com.optimainmobiliaria.user.repository;

import com.optimainmobiliaria.user.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Aquí puedes agregar consultas adicionales específicas si las necesitas
}
