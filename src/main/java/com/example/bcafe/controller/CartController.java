package com.example.bcafe.controller;

import com.example.bcafe.dto.CartDto;
import com.example.bcafe.dto.MenuDto;
import com.example.bcafe.entity.Cart;
import com.example.bcafe.service.CartService;
import com.example.bcafe.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.ModelFactory;

@Controller
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final MenuService serviceMenu;
    private final CartService serviceCart;

    @GetMapping()
    public String openCart(Model model) {
        model.addAttribute("cart", new CartDto());                         // новый заказ
        return "cart";
    }

    @PostMapping("/new")
    public String newOrder(@ModelAttribute CartDto cartDto) {
        serviceCart.saveCart(cartDto);
        return "redirect:/menu";
    }

//    @GetMapping()
//    public String getOrder(Model model) {
//        model.addAttribute("cartSaved", serviceCart.getCart());
//        return "menu";
//    }

    @GetMapping("/{id}")
    public String deleteDish(@PathVariable("id") int id, Model model) {
        serviceMenu.deleteDish(id);
        return "redirect:/cart";
    }

}