package com.example.bcafe.controller;

import com.example.bcafe.dto.MenuDto;
import com.example.bcafe.entity.Menu;
import com.example.bcafe.service.CartService;
import com.example.bcafe.service.MenuService;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService service;
    private final CartService cartService;

    @GetMapping()
    public String openPage() {
        return "menu";
    }

    @GetMapping("/add")
    public String addMenu(@ModelAttribute("menu") Menu menu) {
        service.saveMenu(menu, cartService.getLastCart().getId());   //
        return "redirect:/menu";
    }

}