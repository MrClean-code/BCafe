package com.example.bcafe.dto;

import com.example.bcafe.entity.Cart;
import com.example.bcafe.entity.Menu;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class CartDto {

    private Long id;
    private String name;
    private String surname;
    private Long number;
    private String adress;
    private List<MenuDto> menuList;

//    public static CartDto toCartDtoTwo(Cart cart) {
//        CartDto cartDto = new CartDto();
//
//        cartDto.setId(cart.getId());
//        cartDto.setName(cart.getName());
//        cartDto.setSurname(cart.getSurname());
//        cartDto.setNumber(cart.getNumber());
//        cartDto.setAdress(cart.getAdress());
//        cartDto.setMenuList(cart.getMenuList().stream()
//                .map(MenuDto::toMenuDto)
//                .collect(Collectors.toList()));
//
//        return cartDto;
//    }
//
//    public static Cart toCart(CartDto cartDto) {
//        Cart cart = new Cart();
//
//        cart.setId( cartDto.getId() );
//        cart.setName( cartDto.getName() );
//        cart.setSurname( cartDto.getSurname() );
//        cart.setNumber( cartDto.getNumber() );
//        cart.setAdress( cartDto.getAdress() );
//
//        return cart;
//    }

}
