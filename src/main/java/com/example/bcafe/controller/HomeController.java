package com.example.bcafe.controller;

import com.example.bcafe.dto.CartDto;
import com.example.bcafe.entity.Cart;
import com.example.bcafe.exception.HomeControllerException;
import com.example.bcafe.service.CartService;
import com.example.bcafe.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {

    private final CartService serviceCart;

    @GetMapping()
    public String openPage(Model model) throws HomeControllerException {
        CartDto cartDto = serviceCart.getLastCartDto();
        if (cartDto != null) {
            model.addAttribute("user", cartDto);
        } else {
            throw new HomeControllerException("User is null");
        }
        return "home";
    }


}
