package com.example.bcafe.repository;

import com.example.bcafe.dto.MenuDto;
import com.example.bcafe.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface MenuRepository extends JpaRepository<Menu, Long> {

        @Override
        List<Menu> findAll();

}
