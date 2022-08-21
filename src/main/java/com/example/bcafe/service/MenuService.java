package com.example.bcafe.service;

import com.example.bcafe.dto.CartDto;
import com.example.bcafe.dto.MenuDto;
import com.example.bcafe.entity.Cart;
import com.example.bcafe.entity.Menu;
import com.example.bcafe.mapper.MenuMapper;
import com.example.bcafe.repository.CartRepository;
import com.example.bcafe.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final CartRepository cartRepository;
    private final MenuMapper mapper;

    public List<MenuDto> getMenuDto() {
        List<MenuDto> listMenuDto = repository.findAll().stream()
//                .map(MenuDto::toMenuDto)
                .map(mapper::toMenuDto)
                .collect(Collectors.toList());
        return listMenuDto;
    }

    public MenuDto saveMenu(Menu menu, Long id) {
        Cart cart = cartRepository.findById(id).get(); // пользователь
        menu.setCart(cart);
        repository.save(menu);
//        MenuDto entityMenuDto = MenuDto.toMenuDto(menu);
        MenuDto entityMenuDto = mapper.toMenuDto(menu);
        return entityMenuDto;
    }

    public List<Menu> getMenu() {
        List<Menu> listMenu = repository.findAll().stream()
                .collect(Collectors.toList());
        return listMenu;
    }

    public void deleteDish(long id) {
        repository.deleteById(id);
    }

}