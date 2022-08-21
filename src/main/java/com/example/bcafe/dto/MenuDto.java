package com.example.bcafe.dto;

import com.example.bcafe.entity.Cart;
import com.example.bcafe.entity.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {

    private Long id;
    private String mainChicken;
    private String mainBurrito;
    private String mainPotato;
    private String saladGreek;
    private String saladOranges;
    private String saladShrimp;

//    public static MenuDto toMenuDto(Menu menu) {
//
//        MenuDto menuDto = new MenuDto();
//
//        menuDto.setId( menu.getId() );
//        menuDto.setMainChicken( menu.getMainChicken() );
//        menuDto.setMainBurrito( menu.getMainBurrito() );
//        menuDto.setMainPotato( menu.getMainPotato() );
//        menuDto.setSaladGreek( menu.getSaladGreek() );
//        menuDto.setSaladOranges( menu.getSaladOranges() );
//        menuDto.setSaladShrimp( menu.getSaladShrimp() );
//
//        return menuDto;
//    }

}
