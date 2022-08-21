package com.example.bcafe.mapper;

import com.example.bcafe.dto.CartDto;
import com.example.bcafe.entity.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {

    CartDto toCartDto(Cart cart);

    Cart toCart(CartDto cartDto);
}
