package com.example.bcafe.mapper;

import com.example.bcafe.dto.MenuDto;
import com.example.bcafe.entity.Menu;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface MenuMapper {

    MenuDto toMenuDto(Menu menu);

    Menu toMenu(MenuDto menuDto);
}
