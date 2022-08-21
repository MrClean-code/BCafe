package com.example.bcafe.repository;

import com.example.bcafe.dto.CartDto;
import com.example.bcafe.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {

    @Override
    List<Cart> findAll();

    @Query(value = "SELECT * FROM cafe.cart ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Cart findLastCart();



    // изменить CartDto
}
