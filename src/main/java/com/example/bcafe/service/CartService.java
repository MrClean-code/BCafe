package com.example.bcafe.service;

import com.example.bcafe.dto.CartDto;
import com.example.bcafe.dto.MenuDto;
import com.example.bcafe.entity.Cart;
import com.example.bcafe.mapper.CartMapper;
import com.example.bcafe.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository repository;
    private final CartMapper mapper;

    public CartDto saveCart(CartDto cartDto) {
//        repository.save(CartDto.toCart(cartDto));
        repository.save(mapper.toCart(cartDto));
        return cartDto;
    }

    public Cart getLastCart() {
        Cart cart = repository.findLastCart();
        return cart;
    }

    // вывести отделно список заказов
    public CartDto getLastCartDto() {
        Cart cart = getLastCart();
//        CartDto cartDto = CartDto.toCartDtoTwo(cart);
        CartDto cartDto = mapper.toCartDto(cart);

//        System.out.println(cartDto.getMenuList().size());
//
//        System.out.println(cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getId());
//        System.out.println(cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getMainChicken());
//        System.out.println(cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getMainBurrito());
//        System.out.println( cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getMainPotato());
//        System.out.println(cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getSaladGreek());
//        System.out.println(cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getSaladOranges());
//        System.out.println(cartDto.getMenuList().get(cartDto.getMenuList().size()-1).getSaladShrimp());
        return cartDto;
    }


}
