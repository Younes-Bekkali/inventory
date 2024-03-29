package com.project.inventory.dto;


import com.project.inventory.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder

public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;


    //Maping
    public static CategoryDto fromEntity(Category category){
        if(category == null){
            return  null;
            //Todo throw an exception
        }
        //Category --> CategoryDto
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            return  null;
        }
       Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());

        return category;

    }


}
